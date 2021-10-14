package Practice;

public class NearestElementInArray {

	public static void main(String[] args) {
	
		 int arr[] = { 11, 13, 1, 2, 4, 6, 8, 9 }; 
	        int target = 4; 
	        System.out.println(arr[0]);
	        if (target <= arr[0]) 
	           System.out.println(arr[0]);
	        // return arr[0];
	        
	        if (target >= arr[arr.length - 1]) 
	        	System.out.println(arr[arr.length- 1]);
	        // return arr[n - 1];
	        
	}

}
