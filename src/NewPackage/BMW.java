package NewPackage;

public class BMW extends Car{
	
	int speed=10;
	
	public BMW()
	{   
		this("hai","bye");
		System.out.println("bmw.....default const");
		System.out.println("bmw speed" + speed);
		
	}
	
	public BMW(String str1)
	{
		super("hai");
		System.out.println("bmw.....one param const");
	}

	
	public BMW(String str1, String Str2)
	{
		System.out.println("bmw.....2 param const");
		System.out.println("car speed" + super.speed);
	}
	
	public void Display()
	{
		System.out.println(" displaying the bmw info");
	}

}
