package Practice;

public class FibonacciNumber {

	
	//series of numbers, every number is sum of 2 preceding number
	
	public static void main(String[] args) {
		
		int n1=0, n2=1, sum=0;
		int num = 10;
		
		//System.out.println(n1+"   "+n2);
		
		for(int i=1; i<=num; i++) 
		{
			sum = n1+n2; 
			//System.out.println(sum);
			n1=n2;
			n2=sum;
			System.out.print(" "+sum);
			
			
		}
	
		
	}

}
