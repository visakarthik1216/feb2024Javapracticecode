package OOPConceptpart1;

public class localandglobal {
	int a1=10;
	String s ="new";

	public static void main(String[] args) {
		localandglobal ddd= new localandglobal();
		System.out.println(ddd.a1);
		
		
		int b=20;
		System.out.println(b);
		ddd.sum();
		
		
		

	}
	
	public void sum() {
		int a=2;
		int b=3;
		int c =a1+b;
		System.out.println(c);
		
		System.out.println(s);
		

		
	}
}
