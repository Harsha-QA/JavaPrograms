package Practice;

public class ReverseWordsinString {

	public static void main(String[] args) {
		String str = "welcome to java";
		String[] words = str.split(" ");
		
		String reverse;
		for(String w:words) 
		{
			String reverseword = "";
				for(int i=w.length()-1; i>=0;i--)
				{
					reverseword= reverseword+w.toCharArray();
				}
				System.out.println(reverseword);
		}

	}

}
