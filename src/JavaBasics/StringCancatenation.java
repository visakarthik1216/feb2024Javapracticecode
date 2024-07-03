package JavaBasics;

public class StringCancatenation {

	public static void main(String[] args) {
		int i= 10;
		int j=20;
		
		double d =10.5;
		double d1=12.5;
		
		String s = "Hello";
		String s1= "World";		
				
		System.out.println(i+j);	
		System.out.println(s+s1);
		
		System.out.println(i+j+s+s1);
		System.out.println(s+s1+i+j);
		
		System.out.println(s+s1+(i+j));
		
		System.out.println(i+j+s+s1+j+i);
	    System.out.println(i+j+s+j+s1+i);
	    System.out.println(d+d1); 
	    System.out.println(s+s1+(d+d1));
	    System.out.println("The vaue of i is: "+i);
	    System.out.println("The value of j is: "+j);
	    System.out.println("The total int value is: " +(i+j));
	    System.out.print(" hi this is new line");
	    System.out.println(" Hi this is another line");
	    
	    
	    
	    
	   

	}

}
