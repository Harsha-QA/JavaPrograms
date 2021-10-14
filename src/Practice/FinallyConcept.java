package Practice;

public class FinallyConcept {

	public static void main(String[] args) {
		
		//method1();
		test2();
		//test3();
		//test4();

	}
	
	public static void method1() //
	{
		try {
			System.out.println("inside method body");
		    throw new RuntimeException("test");
		}catch(Exception e) {
			System.out.println("inside catch");
		}
		
			finally {
				System.out.println("inside finally");
			}
		System.out.println("ok");
			}
			
			public static void test2() //finally will execute but even though catch is not there
			
			{
				try {
					System.out.println("indide method");
					}
				finally {
					System.out.println("inside finally though no catch");
				}
			}
		
			public static void test3()
			{
				System.out.println("inside test3");
				try {
					int i= 10/0;
				}
			catch(ArithmeticException e)   //right exception, finally wil execute
				{
				System.out.println("inside catch");
				
				}
				finally 
				{
					System.out.println("inside finally though not catching the exception");
				}
				System.out.println("ok");
			}
			
			public static void test4()
			{
				System.out.println("inside test3");
				try {
					System.out.println("inside try");
					int i= 10/0;
				}
			catch(NullPointerException e)   //wrong exception, finally wil execute still
				{
				System.out.println("inside catch");
				
				}
				finally 
				{
					System.out.println("inside finally though not catching the exception");
					System.out.println("ok");
				}
				System.out.println("ok");
			}
	
}
