package JavaBasics;

public class Employees {
	
	int id;
	String name;
	double salary;
	
	public Employees(int id, String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	

	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public double getSalary() {
		return salary;
	}




	public void setSalary(double salary) {
		this.salary = salary;
	}




	public static void main(String[] args) {
		Employees e =new Employees(10, "visa",5000.45);
		System.out.println(" The first emloyee informations are :"+e.getName() +" "+e.getId()+" "+e.getSalary());
		e.setSalary(5010.45);
		System.out.println(" The first emloyee informations are :"+e.getName() +" "+e.getId()+" "+e.getSalary());
		
	
		
		

	}

}
