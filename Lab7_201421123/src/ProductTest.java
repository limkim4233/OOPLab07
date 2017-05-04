
public class ProductTest {

	public static void main(String[] args) {
		
		ProductTest test=new ProductTest();
		
		SmartTV  tv=new SmartTV();
	    Laptop  laptop=new Laptop();
	    Toaster  t=new Toaster();
	    
	    
	    System.out.println("-----SmartTV----");
		System.out.println(tv.getName());
		test.testNetworked(tv);
		
		System.out.println("-----Toaster----");
		System.out.println(t.getName());
		test.testCooker(t);
		
		System.out.println("-----Laptop----");
	}
	
	public void testCooker(Cooker c) {
		System.out.println(c.prepareFood());
	}
	
	public void testNetworked(Networked n) {
		n.maxSpeed();
		n.isConnected();
	}
	
	public void testProduct(Product p) {
	     p.setPrice(23000);
	     System.out.println(p.getName());
	     System.out.println(p.getPrice());
	      
	}
	
	public void testDataStorage(DataStorage d) {
		d.format();
		d.getFreeCapacity();
	}
	


}
