
from copy import deepcopy, copy 
import time

start = time.time()

def parseBoard(data): 
    """ 
    Takes an iterable (but not string) with string elements. 
    Parses the data into a 2d list of integers to be processed as Sudoku board. 
    Returns the board with a list of empty squares. 
    """ 
    
    board = [[int(x) for x in line.strip()] for line in data] 
    emptySquares = list((x,y) for x in range(9) for y in range(9) if board[x][y]==0) 
    return (board,emptySquares) 

def possibleValues(board, position): 
    """ 
    Returns a generator of valid values of the square on the board 
    at position (row,col). 
    """ 
    
    r,c = position 
    adjacent = tuple(board[r][y] for y in range(9)) + tuple(board[x][c] for x in range(9)) + tuple(board[x][y] for x in range(int(r/3)*3,int(r/3)*3+3) for y in range(int(c/3)*3,int(c/3)*3+3)) 
                                                            
    for v in range(1,10): 
        if v not in adjacent: yield v 

def leastConstrainingValue(board,cell,value): 
    """ 
    Function used in calculating least constraining value heuristic. 
    """ 
    
    r,c = cell 
    adjacent = {(r,y) for y in range(9)} | {(x,c) for x in range(9)} | {(x,y) for x in range(int(r/3)*3,int(r/3)*3+3) for y in range(int(c/3)*3,int(c/3)*3+3)} 
    adjacent.discard(cell) 
                                                                                                                                                  
    return sum(1 for near in adjacent if value in possibleValues(board,near)) 
  
    
def solve(board,emptyCells): 
    """ 
    Returns a solved version of the initial Sudoku board. 
    Board must be 9*9 grid of integers 
    """ 
    
    emptyCells.sort(key = lambda cell: len(list(possibleValues(board,cell)))) 
    
    if len(emptyCells)==0: return board 
    else: row,col = emptyCells.pop(0) 
    
    for value in sorted(possibleValues(board,(row,col)), key = lambda v: leastConstrainingValue(board,(row,col),v)): 
        newBoard = deepcopy(board) 
        newBoard[row][col] = value 
        newBoard = solve(newBoard,copy(emptyCells)) 
        if newBoard: return newBoard 
    
    return False 


#Used for testing algorithm efficiency. 

""" 
board, i = parseBoard(['120400300', '300010050', '006000100', '700090000', '040603000', '003002000', '500080700', '007000005', '000000098']) 
start = clock() 
board = solve(board,i) 
end = clock() 
for line in board: print(line) 
print(end-start) 
"""
board, i = parseBoard(['120400300', '300010050', '006000100', '700090000', '040603000', '003002000', '500080700', '007000005', '000000098']) 
for line in solve(board,i): print(line)
end = time.time()
print(end - start)
