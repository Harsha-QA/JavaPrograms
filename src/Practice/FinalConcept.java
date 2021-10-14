package Practice;

public final class FinalConcept { //this cannot be extended in child class

	public final void start()  //this cannot be overdidden in child class
	{
		System.out.println("test");
	}
	public static void main(String[] args) {
		
		
		final int i=10; //once it is final, cannot change the value	
		    //i =20; 
		    //i = 30; 
		
		    System.out.println(i);
		    
	}

}
