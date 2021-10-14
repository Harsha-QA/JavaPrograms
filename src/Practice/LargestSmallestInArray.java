package Practice;

import java.util.Arrays;

public class LargestSmallestInArray {

	public static void main(String[] args) {
		
		int num[] = {1,33,5,-2,-134,100,3691};
		
		int large = num[0];     //first, it takes 1st value in array.
		int small = num[0];
		
		
		for(int i=1;i<num.length;i++)  //takes the second one and compare with first one[0]
		{
			if(num[i]>large)        //if second is larger than first, that wil store in large
			{
				large= num[i];
			}
			else if(num[i]<small) //if second is smaller than first that will store in small.
			{
				small=num[i];	
			}
			
			}
		System.out.println(Arrays.toString(num));  //returns string representation of  int array 
		System.out.println("largest number is: "+large);
		System.out.println("largest number is: "+small);
		
		}
		 

	}


