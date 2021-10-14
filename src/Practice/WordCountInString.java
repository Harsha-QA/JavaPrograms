package Practice;

import java.util.Scanner;

public class WordCountInString {

	public static void main(String[] args)
	{
		
		String s = "Welcome to java tutorials and";
		//Scanner scan = new Scanner(System.in);
		//String s = scan.nextLine();
		
		int count = 1;
		for(int i = 0;i<s.length();i++)
		
		{
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
			{
				count++;
			}
		}
		
		System.out.println(count);
	}

}
