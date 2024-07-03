package OOPConceptpart1;

public class functions {

	public static void main(String[] args) {
		functions f=new functions();
		f.test1();
		int add=f.test2();
		System.out.println(add);
		int div=f.division(10,5);
		System.out.println(div);
		
		
	

	}

	public void test1() { //no input and no output
		System.out.println("test1");
	}
	
	public int test2() {// no input some output
		System.out.println("test2");
		int a=1;
		int b=2;
		int c =a+b;
		return c;
			
	}
	
	public int division(int x, int y) {
		System.out.println("test3");
		int z=x/y;
		return z;
				
		
	}
	
	
}
