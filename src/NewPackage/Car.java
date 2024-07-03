package NewPackage;

public class Car {
	
	int speed=30;
	
	public Car()
	{
		this(" hai", "bye");
		System.out.println("Car.....default const");
	}
	
	public Car(String str1)
	{
		System.out.println("Car.....one param const");
	}

	
	public Car(String str1, String Str2)
	{
		System.out.println("Car.....2 param const");
	}
	
	public void Display()
	{
		System.out.println(" displaying the car info");
	}


}
