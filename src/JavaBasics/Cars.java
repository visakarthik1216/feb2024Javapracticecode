package JavaBasics;

public class Cars {
	int year;
	String make;
	String model;
	
	
	public Cars()
	{   
		this.make="unknown";
		this.model="unknown";
		
	}
	
	public Cars(int year,String make, String model)
	{
		this.year=year;
		this.model=model;
		this.make=make;
		
	}
	
	

	public static void main(String[] args) {
		Cars c1=new Cars();
		System.out.println(c1.year+ c1.model+ c1.make);
		Cars c2=new Cars(2003,"honda", "civic");
		System.out.println(" first car info"+c2.year+ " " + c2.make+" " +c2.model);
		Cars c3=new Cars(2004,"toyota", "camry");
		System.out.println(" second car info"+c3.year+ " " + c3.make+" " +c3.model);
		
		

	}

}
