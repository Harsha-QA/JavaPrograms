package Practice;
import java.util.HashSet;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

public class RemoveElementFromArray {

	
	//remove any specific in array
	public static void main(String[] args) {
		
		int a[] = {2,1,3,4};
		
		int target =3;
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(int temp : a)
		{
			if(set.add(temp))
			{
				if (temp==target)
				{
					set.remove(target);
				}
				System.out.println(set);
			}
			
		}

	}

}
