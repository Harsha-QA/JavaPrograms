package Practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



public class ReadFileFromTextfile {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("D:\\assignments\\TestExample.txt");
		BufferedReader br = new BufferedReader(fr);
	
	String str;
		
		while((str = br.readLine())!= null)
		{
			System.out.println(str);
		}
		br.close();
		System.out.println("************");
		
		//2nd approach
		File f = new File("D:\\assignments\\TestExample.txt");
		Scanner sc = new Scanner(f);
		
		
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
		
		FileWriter write = new FileWriter("D:\\assignments\\writing.txt");
		BufferedWriter bufwriter = new BufferedWriter(write);
		
		bufwriter.write("sample test writing");
	
		bufwriter.close();	
	}

}
