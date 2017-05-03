
public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProductTest test=new ProductTest();
		SmartTV  tv=new SmartTV();
	    Laptop  laptop=new Laptop();
	    Toaster  t=new Toaster();
	    
	    
	    test.test(tv);
		test.testCooker(t);
		

	}
	public void testCooker(Toaster cooker)
	{
		System.out.println(cooker.prepareFood());
	}
	
	public void test(SmartTV networked)	
	{
		System.out.println(networked.maxSpeed());
	}
	public void testProduct(Product p)
	{
	     p.setPrice(23000);
	     System.out.println(p.getName());
	     System.out.println(p.getPrice());
	      
	}
	


}
