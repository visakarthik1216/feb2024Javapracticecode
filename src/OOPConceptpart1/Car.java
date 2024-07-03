package OOPConceptpart1;

public class Car {
	int mod;
	int wheel;

	public static void main(String[] args) {
		
		Car a = new Car();
		Car b=new Car();
		Car c= new Car();
		System.out.println("before reference change");
		
		
		a.mod=1;
		a.wheel=4;
		
		b.mod=2;
		b.wheel=5;
		
		c.mod=3;
		c.wheel=6;
		
		System.out.println(b.mod);
				
		System.out.println("after reference change");
		
		a=b;
		b=c;
		c=a;
		
		a.mod=40;
		System.out.println(a.mod);
		c.mod=50;
		System.out.println(a.mod);
		
		
				
		

	}

}
