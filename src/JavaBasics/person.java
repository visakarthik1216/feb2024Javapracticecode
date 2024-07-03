package JavaBasics;

public class person {
	
//	Create a Java class named "Person" with the following instance variables:
//
//		name (String)

//		age (int)
//
//		gender (char)
//
//		height (double)
//
//		Create a constructor for the Person class that takes in the name, age, gender, and height as parameters and initializes the instance variables.
//
//		Create a main method that creates two instances of the Person class using the constructor and prints out their information.
	
	String name;
    int age;
    char gender;
    double height;
    
    public person(String name,int age,char gender,double height)
    {
    	this.name=name;
    	this.age=age;
    	this.gender=gender;
    	this.height=height;
    }
    
    
	

	public static void main(String[] args) {
	person p1=new person("visa",38,'f',5.4);
	System.out.println(p1.name +" "+p1.age+" "+p1.gender+" "+p1.height);
	person p2=new person("karthik",40,'m',5.8);
	System.out.println(p2.name +" "+p2.age+" "+p2.gender+" "+p2.height);
	p2.name="karthik raj";
	System.out.println(p2.name +" "+p2.age+" "+p2.gender+" "+p2.height);
	
	
	

	}

}
