
public class Toaster extends Product implements Cooker {
	
	@Override
	public String getName() {
		
		return "Delicious Toaster!";
	}
	
	@Override
	public String prepareFood() {
		
		return "Ready for Making Bread";
		
	}
}
