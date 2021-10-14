package Practice;

public class ReverseString {

	public static void main(String[] args) {
		
		//1st solution
		String s = "SELENIUM TESTING";            //immutable, hence no reverse function
	       //s.length(); //16
		
			String rev="";
			
			for(int i = s.length()-1; i>=0; i--) //16-1, bcos index start from 0
		{									     // last char wil store in rev and it decrement.
			rev = rev+ s.charAt(i);              // that characters index wil keep on storing in rev
			
		}
		System.out.println(rev);
	
	//2nd solution
	//String sbuf = ;
   StringBuffer sb = new StringBuffer("harsha writing selenium test"); //mutable
   System.out.println(sb.reverse());
           
}
}