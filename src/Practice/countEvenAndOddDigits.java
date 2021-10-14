package Practice;

public class countEvenAndOddDigits {

	public static void main(String[] args) {
		
		int n = 1234567789;

		int evencount = 0;
		int oddcount = 0;
	
		while (n>0)
	 {
		//int remainder = n%10;
		
		if(n%2 == 0) 
		{
			evencount++;
		}
		else {
			oddcount++;
		}
		n=n/10;
	 }
System.out.println("even numbers "+evencount);
System.out.println("odd numbers "+oddcount);	
	}

}
