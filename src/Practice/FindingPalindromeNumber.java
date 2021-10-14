package Practice;

public class FindingPalindromeNumber {

	//reverse of number is same. 151 is  palindrome
	//768 is not palindrome
	
	public static void main(String[] args) {
		
		palind(107);

	}

	public static void palind(int num)
	{
		int r=0;
		
		int t;
		t=num;
		
		while(num>0) 
		{
			   //get the remainder (151%10 means 1 is remainder)
				r = (r*10) + num % 10; //initially sum = 0, 0*10 = 0, + 1(r)
				num = num/10;
		}
		if(t==r) 
		{
			System.out.println("palindrome number");
		}
		else {
			System.out.println("not palindrome");
			
		}
	}
}
