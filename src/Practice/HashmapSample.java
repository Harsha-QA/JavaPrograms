package Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;



public class HashmapSample {

	public static void main(String[] args) {
		
		
		Map<String, String> hm= new HashMap<String, String>();
		hm.put("Harshac", "mandya");
		hm.put("Madhu", "tumkur");
		hm.put("peter", "USA");
		hm.put("Harsha", "mysore");
		hm.put("deepu", "mandya");
		hm.put(" ", "belgavi");
		hm.put(" ff", " ");
		hm.put(" gg", " ");
		System.out.println(hm);
		
		System.out.println(hm.get("peter"));
		
		//1. we can print all the elements 
		Set<String> keys = hm.keySet(); //keySet() -> returns all the keys contained in the map
		for(String i : keys)
		{
			System.out.println(i+": "+hm.get(i));
		}
		System.out.println("*************************");
		
		//2. Map is the interface and Entry is also an interface inside Map interface
		    //nested interface
		Set<Map.Entry<String, String>> values = hm.entrySet();
		for(Map.Entry<String, String> e : values)
		{
			System.out.println(e.getKey()+ ": " +e.getValue());
		}

	}

}
