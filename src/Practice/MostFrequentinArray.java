package Practice;
import java.util.*;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MostFrequentinArray {

	public static void main(String[] args) {
		
		int a[] = {5,7,9,8,5,5,5,5,5,8,7,6,6,6,6};
		
		
		Map<Integer, Integer> hm = new HashMap<>();
		
		for(int i =0;i<a.length;i++)
		{
			if(hm.containsKey(a[i]))
			{
				int count = hm.get(a[i]);
				count++;
				hm.put(a[i], count);
			}
			else {
				
				hm.put(a[i], 1);
			}
			}
		int maxcount =0;
		int mode = 0;
		for(Entry<Integer, Integer> val : hm.entrySet())
		{
			if(maxcount<=val.getValue())
			{
				mode =val.getKey();
				maxcount=val.getValue();
			}
		}
		System.out.println("number is "+ mode+", " +maxcount+ " times");
		}
		
	

	}


