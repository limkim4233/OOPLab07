
public class Toaster extends Product implements Cooker {
	
	@Override
	public String getName() {
		
		return "Toaster";
	}
	
	@Override
	public String prepareFood() {
		
		return null;
	}
}
