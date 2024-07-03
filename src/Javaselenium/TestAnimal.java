package Javaselenium;

public class TestAnimal {

	public static void main(String[] args) {
		
	Snake s= new Snake();
	s.sleep();
	s.eat();
	s.crawl();
	s.strike();
	if(s.venomous)
	{
		System.out.println(" be careful");
	}

	
	
	Animal a=new Snake();
	a.sleep();
	a.eat();
	System.out.println(a.age);
	
	Bird b=new Eagle();
	b.fly();
	b.sleep();
	b.eat();
	
	
	
	
	

	
}
	
	


	
	

}
