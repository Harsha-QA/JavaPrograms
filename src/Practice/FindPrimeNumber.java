package Practice;

public class FindPrimeNumber {

	//no. divided by itself and 1.
	//ex. 8 can be divided by 2 and 4.
	
	public static void main(String[] args) {
		
		System.out.println(isPrime(7));
		//getprime(9);
	}
//		int n = -6;
//		
//		
//			
//		if(n%2==0)
//		{
//			System.out.println(n +" is not prime");
//		}
//		
//		else {
//			System.out.println(n +" is prime");
//		}
//		}
//    
	

	public static boolean isPrime(int num)
	{
		if(num<=1) {
			return false;
		}
		
		for(int i =2;i<num;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
			return true;
		}
		
	public static void getprime(int num1) {
		for(int i=2;i<=num1;i++)
		{
			if(isPrime(i))
			System.out.println(i);
		}
	}
    }
