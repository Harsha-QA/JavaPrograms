package Practice;

public class FactorialNumber {
	
	//5 = 5*4*3*2*1
	//0 = 1
	//1=1
	
	//1.without recursive - for loop
		public static int factorial(int num)
		{	
			
			int fact = 1;
			
			if(num==0)
			return 1;
			
			for(int i=1;i<=num;i++) {
				fact = fact*i;
			}
			return fact;
		}
		
		public static int recursiveFactorial(int num)
		{
			if(num==0 )
				return 1;
			else
			
				return (num * (recursiveFactorial(num-1)));
			
		}
		
	public static void main(String[] args) {
		
		System.out.println(factorial(10));
		System.out.println(recursiveFactorial(10));

	}

}
