package Practice;

public class StringBanalncedOrNot {

	public static void main(String[] args) {
		//write a program to examine whether the pairs whether give string is balanced or not "((()((( ))"
		
		String str = "())";
		int countopen=0;
		int countclose=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='(')
				
			{
				countopen++;
				System.out.println(countopen);
			}
			
			if(str.charAt(i)==')')
			{
				
				countclose++;
				System.out.println(countclose);
			}
			}
			
			if(countopen == countclose)
			{
				System.out.println("blanced");
			}
			else 
				System.out.println("not balanced");
		}

	}


