package Practice;

public class MissingNumInArray {

	public static void main(String[] args) {
		
		//missing number in number sequence (sorted order)
		int a[] = {1,2,3,5,6,7,8}; //it adds whatever there in array body
		
		int sum=0;
		for(int i =0;i<a.length;i++)
		{
			sum=sum+a[i]; 
		}
       System.out.println(sum);
	
    
	int sum1=0;
	for(int j=0;j<=8;j++)         //it adds till 8 numbers
	{
		sum1=sum1+j;
	}
	System.out.println(sum1);     
	System.out.println(sum1-sum);
}
}