package Practice;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class RepetativeStringOccurance {

	//first repetitive character using hash map
	public static void main(String[] args) {
		
		String str = "hi how are you hi you";
		
		String[] s = str.split(" ");
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		for(String temp : s)
		{
			if (hm.get(temp)!= null)
         {
          hm.put(temp, hm.get(temp)+1);
         }
			else 
			{
			hm.put(temp, 1);
		}
		}
		System.out.println(hm);
		Iterator<String> itr = hm.keySet().iterator();
		while(itr.hasNext())
		{
			String temp1 = itr.next();
			if(hm.get(temp1)>1)
			{
				System.out.println(temp1 + " appearing "+ hm.get(temp1)+ " times");
			}
		}
		
}
}
