package JavaBasics;

public class consttest {
	
	int a;
	int b;
	
	public consttest()
	{
		System.out.println(" this is default const");
		testmethod();
		System.out.println(+a +" " +b);
		constest1 newob=new constest1();
		newob.test1();
		
	}
	
	public consttest (int a)
	{
		a=6;
		b=2;
		System.out.println(" const with one param" +a+" "+b);
		consttest ob2=new consttest(5,6);
		constest1 newob1=new constest1(4);
		
		
	}
	
	public consttest (int a, int b)
	{
		System.out.println(" const with 2 param");
		
	}
	
	public void testmethod()
	{
		System.out.println(" this is test method");
		
	}
	

	public static void main(String[] args) {
		consttest ob=new consttest();
		consttest ob1=new consttest(2);
		
	
		
				
		

	}

}
