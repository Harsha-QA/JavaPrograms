package Practice;

import java.util.Arrays;
import java.util.Collections;

public class SortInbuiltFunction {

	public static void main(String[] args) {
		
		
		int a[] = {2,35,4,89,43,342,23};
		
		//1st approach
		//Arrays.parallelSort(a);
		
		System.out.println(Arrays.toString(a));
		
		//2nd approach
		//Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		Integer b[] = {2,35,4,89,43,342,23};
	   //3rd descending order.
		Arrays.sort(b,Collections.reverseOrder());
		System.out.println(Arrays.toString(b));

	}

}
