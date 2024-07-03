package naveenSelenium;

public class Employee {
	String name;
	int age;
	String city;

	public static void main(String[] args) {
		Employee e1= new Employee();
		Employee e2=new Employee();
		Employee e3= new Employee();
		Employee e4= new Employee();
		
		e1.name="arti";
		e1.age=	10;
		e1.city="chennai";
		
		e2.name="jay";
		e2.age=	20;
		e2.city="mumbai";	
		
		e3.name="madhan";
		e3.age=	30;
		e3.city="banglore";
		
		e4.name="vihaan";
		e4.age=40;
		e4.city="coimbatore";
		
		System.out.println(e1.name+" "+ e1.age+" "+e1.city );//arti
		System.out.println(e2.name+" "+ e2.age+" "+e1.city );//jay
		System.out.println(e3.name+" "+ e3.age+" "+e3.city );//madhan
		System.out.println(e4.name+" "+ e4.age+" "+e4.city );//vihaan
		
		System.out.println("---------------------------------------------");
		
		e1=e2;
		System.out.println(e1.name+" "+ e1.age+" "+e1.city );//jay
		System.out.println(e2.name+" "+ e2.age+" "+e1.city );//jay
		System.out.println(e3.name+" "+ e3.age+" "+e3.city );//madhan
		System.out.println(e4.name+" "+ e4.age+" "+e4.city );//vihaan
		
		System.out.println("---------------------------------------------");
		
		e2=e3;
		System.out.println(e1.name+" "+ e1.age+" "+e1.city );//jay
		System.out.println(e2.name+" "+ e2.age+" "+e1.city );//madhan
		System.out.println(e3.name+" "+ e3.age+" "+e3.city );//madhan
		System.out.println(e4.name+" "+ e4.age+" "+e4.city );//vihaan
		
		System.out.println("---------------------------------------------");
		
		e3=e4;
		System.out.println(e1.name+" "+ e1.age+" "+e1.city );//jay
		System.out.println(e2.name+" "+ e2.age+" "+e1.city );//madhan
		System.out.println(e3.name+" "+ e3.age+" "+e3.city );//vihaan
		System.out.println(e4.name+" "+ e4.age+" "+e4.city );//vihaan
		

		System.out.println("---------------------------------------------");
		
		e4=e1;
		System.out.println(e1.name+" "+ e1.age+" "+e1.city );//jay
		System.out.println(e2.name+" "+ e2.age+" "+e1.city );//madhan
		System.out.println(e3.name+" "+ e3.age+" "+e3.city );//vihaan
		System.out.println(e4.name+" "+ e4.age+" "+e4.city );//jay
		
		System.out.println("---------------------------------------------");
		
		e1=e2;
		
		System.out.println(e1.name+" "+ e1.age+" "+e1.city );//madhan
		System.out.println(e2.name+" "+ e2.age+" "+e1.city );//madhan
		System.out.println(e3.name+" "+ e3.age+" "+e3.city );//vihaan
		System.out.println(e4.name+" "+ e4.age+" "+e4.city );//jay
		
		System.out.println("---------------------------------------------");
		
		e1=e2=e3;
		System.out.println(e1.name+" "+ e1.age+" "+e1.city );//v
		System.out.println(e2.name+" "+ e2.age+" "+e1.city );//v
		System.out.println(e3.name+" "+ e3.age+" "+e3.city );//v
		System.out.println(e4.name+" "+ e4.age+" "+e4.city );//jay
		
		System.out.println("---------------------------------------------");
		
		e1=e2=e3=e4;
		System.out.println(e1.name+" "+ e1.age+" "+e1.city );//j
		System.out.println(e2.name+" "+ e2.age+" "+e1.city );//j
		System.out.println(e3.name+" "+ e3.age+" "+e3.city );//j
		System.out.println(e4.name+" "+ e4.age+" "+e4.city );//j
		
	
		
		
				
				

	}

}
