package Practice;

import java.util.Arrays;

public class BubbleSort {

	//compare 1 value with other and if 1 is greater than 2 swap...... until all elements sorted properly
	public static void main(String[] args) {
		
		int a[] = {2,35,4,89,43,342,23};
		
		System.out.println(Arrays.toString(a));
		
		int n=a.length;
		
		for(int i=0;i<n-1;i++) //no. of passes
		{
			for(int j=0;j<n-1;j++) //iteration, to compare every entries
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));

	}

}
