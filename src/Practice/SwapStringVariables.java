package Practice;

public class SwapStringVariables {

	public static void main(String[] args) {
		String a= "hello";
		String b ="world";
		
		System.out.println("before swapping" +a+b);
		
		//1. appending
		a=a+b; //hellworld
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length()); 
		System.out.println("after swapping" +a+b);

	}

}
		