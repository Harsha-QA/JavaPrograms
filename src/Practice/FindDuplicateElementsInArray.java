package Practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class FindDuplicateElementsInArray {
	
	public static void main(String[] args) {
		
		String a[]={"abhi","akash","appu","ajay","anand","appu","abhi"};
		
		//1st solutions, O(nxn) --- take more time
		for(int i = 0;i<=a.length;i++)  //compare each value with every other value
		{                                   
			for(int j=i+1;j<a.length;j++) //comparing value with next value, ie, i(0) with j(1), j=i+1
			{
				if(a[i].equals(a[j]))
				{
					System.out.println("repeated value is :"+a[i]);
				}
			}
		}
		System.out.println("*********");
		
		//2. HashSet- java collection- it stores unique values. O(n)
		Set<String> setstore = new HashSet<String>();  //set is the interface, hashset is the class 
		
		for(String name:a)                             //storing each value from 'a' to name in every iteration
		{
			if(setstore.add(name)==false) {
				System.out.println("set repeated value is :"+name);
			}
		}
		System.out.println("*********");
		
		//3 using map(2n)
		Map<String, Integer>  mapstore = new HashMap<String, Integer>(); //hashmmap implementing map interface
		
		for(String name : a)
		{
			
			Integer count= mapstore.get(name);
			if(count ==null)
			{
				mapstore.put(name, 1);
			}
			else
			{
				mapstore.put(name,++count);
			}
			
		}
			Set<Entry<String,Integer>> entryset = mapstore.entrySet();
			for(Entry<String,Integer> entry :entryset)
			{
				if(entry.getValue()>1)
				{
					System.out.println( entry.getKey());
				}
			}
		
	}

}
