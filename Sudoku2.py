
from copy import deepcopy, copy 
import time

start = time.time()

def parseBoard(data):
    
    board = [[int(x) for x in line.strip()] for line in data] 
    emptySquares = list((x,y) for x in range(9) for y in range(9) if board[x][y]==0) 
    return (board,emptySquares) 

def possibleValues(board, position): 
    
    r,c = position 
    adjacent = tuple(board[r][y] for y in range(9)) + tuple(board[x][c] for x in range(9)) + tuple(board[x][y] for x in range(int(r/3)*3,int(r/3)*3+3) for y in range(int(c/3)*3,int(c/3)*3+3)) 
                                                            
    for v in range(1,10): 
        if v not in adjacent: yield v 

def leastConstrainingValue(board,cell,value): 
    
    r,c = cell 
    adjacent = {(r,y) for y in range(9)} | {(x,c) for x in range(9)} | {(x,y) for x in range(int(r/3)*3,int(r/3)*3+3) for y in range(int(c/3)*3,int(c/3)*3+3)} 
    adjacent.discard(cell) 
                                                                                                                                                  
    return sum(1 for near in adjacent if value in possibleValues(board,near)) 
  
    
def solve(board,emptyCells): 
    
    emptyCells.sort(key = lambda cell: len(list(possibleValues(board,cell)))) 
    
    if len(emptyCells)==0: return board 
    else: row,col = emptyCells.pop(0) 
    
    for value in sorted(possibleValues(board,(row,col)), key = lambda v: leastConstrainingValue(board,(row,col),v)): 
        newBoard = deepcopy(board) 
        newBoard[row][col] = value 
        newBoard = solve(newBoard,copy(emptyCells)) 
        if newBoard: return newBoard 
    
    return False 

board, i = parseBoard(['120400300', '300010050', '006000100', '700090000', '040603000', '003002000', '500080700', '007000005', '000000098']) 
for line in solve(board,i): print(line)
end = time.time()
print(end - start)
