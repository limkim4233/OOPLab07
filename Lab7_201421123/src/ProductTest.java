
public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProductTest test=new ProductTest();
		Product  tv=new SmartTV();
	    Product  laptop=new Laptop();
	    Product  t=new Toaster();
	    
	    test.testProduct(tv);
		test.testProduct(laptop);
		test.testProduct(t);

	}
	{
		
	}
	
	public void testDataStorage(SmartTV t)	
	{
		
	}
	public void testProduct(Product p)
	{
	      p.setPrice(20000);
	      System.out.println(p.getPrice());
	      System.out.println(p.getName());
	      
	}
	


}
