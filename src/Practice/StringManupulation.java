package Practice;

public class StringManupulation {

	public static void main(String[] args) {
		
		        
		        String s =  new String("Test");
				s.concat("practice");
				System.out.println(s); //immutable cannnot be changed
				
				String s1 =  new String("Test");
				System.out.println(s==s1); //false, reference comparison. both are different object stored in same address in memory 
				System.out.println(s.equals(s1));//true, content comparison 
				
				StringBuffer sb = new StringBuffer("For");
				sb.append(" Interview");
				System.out.println(sb); // , can be modified

				StringBuffer sb1 =  new StringBuffer("For");
				System.out.println(sb==sb1); //false, reference comparison. both are different object stored in same address in memory 
				System.out.println(sb.equals(sb1));//false, reference comparison. both are different object stored in same address in memory
				
				System.out.println("The output of string methods");
				String str = "SELENIUM AUtOMATION";
				System.out.println(str.isEmpty());
				System.out.println(str.length());
				System.out.println(str.replace("U", "k"));
				System.out.println(str.substring(5));
				System.out.println(str.substring(4, 8));
				System.out.println(str.indexOf("M"));
				System.out.println("finding second m: "+(str.indexOf("M", str.indexOf("M")+1)));
				System.out.println(str.lastIndexOf("m"));
				
				System.out.println(str.toLowerCase());
				System.out.println(str.trim());//removes spaces at first and last
				
				String splitit = "This sentence is to learn the split methods in java";
				
				
				String spl[] = splitit.split(" ");
				for(String w : spl) 
				{
					System.out.println(w);
				}
				
				String spl1[]= splitit.split(" ", 3);
				for(String x : spl1) 
				{
					System.out.println("ok"+x);
				}
			
				String spl2[]= splitit.split("n");
				for(String y : spl2) 
				{
					System.out.println(y);
				}
				
				System.out.println(sb.length());
				System.out.println(sb.capacity());//how many characters can string buffer can hold
				System.out.println(sb.charAt(11));//what is at 11th index. if more given returns stringindexoutofbond exception
				sb.setCharAt(4, 'A'); //replaces A in 4th index
				System.out.println(sb);
				System.out.println(sb.append(776));//we can append any type of data here.
				System.out.println(sb.insert(2, true));
				System.out.println(sb.insert(4, "tr55v"));
				System.out.println(sb.delete(2, 15));
				System.out.println(sb.reverse());//reverse the srting.
				sb.setLength(11); //it returns only that length, if 3, only 3 characters returns.
				System.out.println(sb);
				sb.ensureCapacity(1000);//we can increase the capacity of the string buffer with specified no. based on our requirement.
				System.out.println(sb.capacity());//it is increased to 1000 characters. 
				System.out.println(sb.append("abc"));
				sb.trimToSize();//deallocate the extra allocated memory
				
			}

		

	}


