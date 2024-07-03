package JavaBasics;

public class FunctionLearn {
	
	int a=1;
	static int b=2;
	private int c=2;
	 int d;
	
	public void testnormal()
	{
	 System.out.println("This is not static method and variable :  " +a +" "+b +" "+c);
	 teststatic();
	}
	
	
	public static void teststatic()
	{
		System.out.println("This is static method :" +b);
		testnewstatic();
	
		
	}
	
	private void testnewnormal()
	{
		System.out.println(" this is 2nd normal method");
	}
	
	private static void testnewstatic()
	{
		System.out.println("This is another new static method :" +b);
		
	}

	public static void main(String[] args) {
		
		FunctionLearn ob=new FunctionLearn();
		ob.testnormal();
		//teststatic();
	ob.a=2;
	System.out.println(ob.a);
	b=3;
	System.out.println(b);
	ob.testnewnormal();
	testnewstatic();
	ob.d=4;
	
		
	
		}
	

	}


