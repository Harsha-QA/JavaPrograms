package Practice;

public class ArmstrongNum {
     
	//cube of every number and addition of cube is  equal to given no..
	//153
	//1*1*1 + 5*5*5 + 3*3*3 = 153
	
	
	public static void main(String[] args) {
		
 isArmstrong(153);
	}

	public static void isArmstrong(int num)
	{
		int cube=0;;
		int r;
		int t;
		
		t=num;
		while(num>0) {
			r= num % 10;
			num= num / 10;
			cube = cube+(r*r*r);
		}
		if(t==cube) {
			System.out.println("armstrong");
		}
			else
			{
				System.out.println("not armstrong");
			}
		}
	}

