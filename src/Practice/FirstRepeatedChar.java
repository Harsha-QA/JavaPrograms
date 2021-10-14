package Practice;

public class FirstRepeatedChar {

	public static void main(String[] args) {
		
		String str = "jvvaa";
	
		for(int i = 0; i < str.length(); i++) 
		{
            
			char ch = str.charAt(i);
            int firstIndex = str.indexOf(ch);
            int lastIndex = str.lastIndexOf(ch);
            if(firstIndex != lastIndex) 
            {
                System.out.println("The character '"+ch+"' is repeated");

	}
		}
	}
}
