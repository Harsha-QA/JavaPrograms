package Practice;
import java.util.HashMap;
import java.util.Map;

public class RepetativeCharOccurance {

	public static void main(String[] args) {
		
		String str = "hi how are you hi you";
		Character ch;
		Map<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for (int i = 0; i<str.length();i++)
		{
			 ch = str.charAt(i);
			if(hm.get(ch)!=null) 
			{
				hm.put(ch, hm.get(ch)+1);
			}
			else
			{
				hm.put(ch, 1);
			}
		}
		System.out.println(hm);
		
	}

}
