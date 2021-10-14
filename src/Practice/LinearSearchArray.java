package Practice;

public class LinearSearchArray {

	public static void main(String[] args) {
		
		int a1[]= {2,3,4,5,6};
		
		int item=5;
		
		boolean flag = false;
		
		for(int i=0;i<=a1.length;i++)
		{
			if(item == a1[i])
			{
				System.out.println("element found at "+i);
				break;
			}
			
		}
		if(flag==false)
		{
			System.out.println("not found");
		}
			
			
		}

	}


