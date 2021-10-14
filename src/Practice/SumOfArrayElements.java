package Practice;

public class SumOfArrayElements {

	public static void main(String[] args) {
		
		int a[] = {2,4,6,7,8,3,6,99};
		
		int sum = 0;
		int sum1 =0;
		
		for(int i=0;i<a.length;i++) 
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
	
	
	for(int add: a)
	{
		sum1=sum1+add;
	}
System.out.println(sum1);
}
}