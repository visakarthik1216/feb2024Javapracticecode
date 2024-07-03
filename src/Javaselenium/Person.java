package Javaselenium;

public class Person {

	private String name;
	private int age;
	private char Gender;
	private int a=5;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return Gender;
	}

	public void setGender(char gender) {
		Gender = gender;
		printInfo();
	}
	
	private void printInfo()
	{
		System.out.println(" The name is : " +getName());
		System.out.println("The age is : " +getAge());
		System.out.println(" The gender is: " +getGender());
		
		
		
	}
}
	
//	public static void main(String[] args) {
//		
//		Person ob=new Person();
//		ob.setName("visa");
//		ob.setAge(5);
//		ob.setGender('F');
//		ob.printInfo();
		
		
		

	

	

