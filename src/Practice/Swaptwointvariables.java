package Practice;

public class Swaptwointvariables {

	public static void main(String[] args) {
		
		int x= 10;
		int y = 20;
		
		int z;
		
//		z=x;
//		x=y;
//		y=z;
//		System.out.println(x);
//		System.out.println(y);
//		//System.out.println(z);
		
		//without using 3rd variable
		//x=x+y; //10+20 = x=30
		//y=x-y; //30-20 = y=10
		//x=x-y; //x= 3
		
		//System.out.println(x);
		//System.out.println(y);
		
		x=x*y;
		y=x/y;
		x=x/y;
		System.out.println(x);
		System.out.println(y);
		
	}

}
