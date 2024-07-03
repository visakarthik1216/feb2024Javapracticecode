package OOPConceptPart2;

public class Testcar {

	public static void main(String[] args) {
		BMW b1=new BMW();
		b1.start();
		b1.stop();
		b1.refuel();
		b1.theftsafety();
		b1.engine();
		
		Car c1=new Car();
		c1.start();
		c1.engine();
		
		Car c2=new BMW();
		c2.start();
		c2.stop();
		c2.engine();
		
		Vehicle v1=new Vehicle();
		v1.engine();
		v1.stop();
		
	
			
		
		
		

	}
	
	

}
