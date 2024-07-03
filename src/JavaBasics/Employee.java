package JavaBasics;

public class Employee {
	
	String name;
	int age;
	double salary;
	double totalsalary;

	public static void main(String[] args) {
		
		Employee e1= new Employee();
		e1.name="bob";
		e1.age=10;
		e1.salary=1300.54f;
		
		Employee e2= new Employee();
		e2.name="martin";
		e2.age=20;
		e2.salary=1800.90f;
		
		Employee e3= new Employee();
		e3.name="jack";
		e3.age=10;
		e3.salary=5000.30f;
		
		System.out.println("employee1 details :" + e1.name +" "+e1.age+ " "+ e1.salary);
		System.out.println("employee1 details :" + e2.name +" "+e2.age+ " "+ e2.salary);
		System.out.println("employee1 details :" + e3.name +" "+e2.age+ " "+ e3.salary);
		System.out.println("total salary :" + (e1.salary+e2.salary+e3.salary) );
		
		
		
		
		
		
		
		

	}

}
