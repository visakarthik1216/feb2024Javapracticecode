package NewPackage;

public class Testexception {
	
		
	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		if (a>b)
		{
			System.out.println("a is greater");
		}
		else
		{ 
			System.out.println(" b is greater");
			//throw new MyException(" please try checking by inputting a has greater number");
		}
		
		try {
		int c=9/0;
		System.out.println(c);
		}
		catch (Exception e)
		{
			
			e.printStackTrace();
			
		}
	
		
		
		

	}

}
