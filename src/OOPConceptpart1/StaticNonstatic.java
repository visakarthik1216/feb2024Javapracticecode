package OOPConceptpart1;

public class StaticNonstatic {
	static String s= "hai";
	int i=4;
	

	public static void main(String[] args) {
		StaticNonstatic ob=new StaticNonstatic();
		System.out.println(ob.i);
	    System.out.println(s); 
	    
	    ob.sum(ob.i);
	    sum1(s);
	    
	    
	    
	    
		

	}

	public void sum( int i)
	
	{
	System.out.println("non static method");
	System.out.println(i);
	System.out.println();
	}
	
	public static void sum1 (String s) {
	System.out.println(s);
	}
	
	
	
}
