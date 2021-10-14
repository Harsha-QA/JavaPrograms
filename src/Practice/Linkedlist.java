package Practice;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist{

	 public static void main(String args[])
	    {
		 LinkedList<String> link = new LinkedList<String>();
		 LinkedList<Integer> linkint = new LinkedList<Integer>();
		 
		 link.add("harsha");
		 link.add("deepu");
		 link.add("mandya");
		 link.add("pes");
		 linkint.add(0);
		 linkint.add(1);
		 linkint.add(12);
		 linkint.add(15);
		 linkint.add(16);
		 System.out.println(link);
		 System.out.println(link.getLast());
		 System.out.println(linkint);
		 System.out.println(linkint.get(2));
		 
		 Iterator it = linkint.iterator();
		 
		 while (it.hasNext())
		 {
			 if((int)it.next()==18)
			 {
				 System.out.println("found 15");
			 }
		}
}
}