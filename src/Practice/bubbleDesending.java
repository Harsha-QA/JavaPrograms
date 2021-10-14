package Practice;

public class bubbleDesending {
	
	//print the array list in descending order
	//50,20,90,30,10

	public static void main(String[] args) {
		
		//String a = "welcome to moolya";
		
		//System.out.println(a.lastIndexOf("e", 16));
		//System.out.println(a.);
		
		int a[]= {50, 20, 90,30,10};
		
		
		for(int i =0; i<a.length;i++)
		{
			for(int j =0; j<a.length-1;j++)
			{
				if(a[j]<a[j+1])
				{
					int temp = a[j+1];
					a[j+1]= a[j];
					a[j]=temp;
					
				}
				System.out.println(a[j]);
			}
		

	}

	}
}
