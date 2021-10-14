package Practice;

import java.util.Arrays;

public class EqualityOf2Arrays {
	
//	public static void arr(int a[],int b[]) 
//	{
//		boolean status = true;
//		if(a.length==b.length)
//		{
//			
//		
//		for(int i=0;i<=a.length;i++)
//		{
//			if(a[i]!=b[i]) {
//				status = false;
//			}
//		}
//	}
//	}
	public static void main(String[] args) {
		
		int a1[]= {2,3,4,5,6,1,7};
		int a2[]= {2,3,4,5,6,7};
		
		if(a1.length==a2.length)
		{
			System.out.println("length are same");
		}
		else
			System.out.println("length not matching");
		
		boolean state = Arrays.equals(a1, a2);
		if(state == true)
			System.out.println("equal");
		else
			System.out.println("not equal");
      
		
	}

}
