package Practice;

import java.util.Arrays;

public class Largest2ndinArray {

	public static void main(String[] args) {
		int a[] = {2,3,5,6,3,4,235,300,400,53,2,23,0};

		
		int large = a[0];
		int secondlarge = a[0];
		
		for(int i= 1;i<a.length;i++)
			
		{
			
		
		if(a[i]>large) 
		{
			secondlarge = large;
			large = a[i];
		}
		
		else if (a[i]>secondlarge)
		{
			secondlarge = a[i];
		}
		
		}
		System.out.println(secondlarge);
	}
	}
	


