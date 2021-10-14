package Practice;
import java.util.HashMap;
import java.util.Map;

public class NonRepetativeChar {

	public static void main(String[] args) {
		 String str = "qwertrrerwrq";
		 Character ch;
		 
		 Map<Character, Integer> hm = new HashMap<Character, Integer>();
		 
		 for(int i=0;i<str.length();i++)
		 {
		 ch = str.charAt(i);
		 if(hm.containsKey(ch)== false)
		 {
			 hm.put(ch, 1);
		 }
		 else
		 {
			 hm.put(ch, hm.get(ch)+1);
		 }

	}
		 System.out.println(hm);
		 for(int j=0;j<str.length();j++)
		 {
			 ch = str.charAt(j);
			
			 if(hm.get(ch)==1)
			 {
				 System.out.println(ch);
				 break;
			 }
		 }

}
}
