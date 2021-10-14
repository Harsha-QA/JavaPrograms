package Practice;

public class RemoveJunkvaluesInString {

	public static void main(String[] args) {
		
		String s = "#$%^&H@#$%^a#$%^r$%s%^hhAA";
		//Regular expression [^a-zA-Z0-9]
		
		String afteremove = s.replaceAll("[^a-zA-Z0-9]", ""); //^ NO.. remove everything except this
		System.out.println(afteremove);

	}

}
