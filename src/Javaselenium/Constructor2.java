package Javaselenium;

public class Constructor2 {
	
	public Constructor2()
	{
		System.out.println(" default constructor from new constructor");
		Constructor2 ob1= new Constructor2(4);
		ob1.test1();
		
		
		
	}
	
	public Constructor2(int a)
	{
		System.out.println(" constructor with 1 constructor from new constructor");
		Constructor1 ob=new Constructor1(); 
		ob.test();
	
	
	}
	
	public void test1()
	{
		System.out.println("method from new constructor");
	}

	public static void main(String[] args) {
		Constructor2 ob= new Constructor2();
		
	

	}

}
