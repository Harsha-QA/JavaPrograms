package Practice;

import java.util.ArrayList;
import java.util.Arrays;



public class arrayAndArrayList {
	

	public static void main(String[] args) {
		
		int a1[] = {1,2,3};	
		
		int count = 0;
		 
		    //Print no. of array elements without using length method
	        for(int i:a1)
	        {
	        	count++;
	        }   	        
			System.out.println(count);
			
			System.out.println("*******************************");
			
			int a = 100; 
			int b = 6; 
			int result = a / b; 
			int remainder = a%b ; 
			
			//ArrayList using non primitive data type(it allows only non primitive data type)
			ArrayList<Integer> list = new ArrayList<Integer>();
			
			for(int i= 0; i<b;i++)
			{
				list.add(result);
			}
			
			list.add(remainder);
		System.out.println(list);
		
		System.out.println("**********************************");
		
		String str[]= {"Jai","hanuman"};
		str[1] = "maruthi";
		System.out.println(Arrays.toString(str));
		
		
		ArrayList<String> arrStr = new ArrayList<String>();
		arrStr.add("Jai");
		arrStr.add("Sriram");
		
	System.out.println(arrStr);
		
		
	}
		
		
}
	

