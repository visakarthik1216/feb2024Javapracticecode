package Javaselenium;

public class TestVehicle {

	public static void main(String[] args) {
		
		Truck t=new Truck();
		t.start();
		t.stop();
		t.accelarate();
		t.loadCargo();
		
		System.out.println("...........");
		
		Vehicle v=new Truck();
		v.start();
		v.stop();
		v.accelarate();
		System.out.println(v.brand); //variable will not be overridden
		
		

	}

}
