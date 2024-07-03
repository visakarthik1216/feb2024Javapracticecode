package naveenSelenium;

public class Student {
	
	String name;
	int age;

	public static void main(String[] args) {
		int count=0;
		Student s1=new Student();
		s1.name="vihaan";
		s1.age=9;
		count++;
		
				
		Student s2=new Student();
		s2.name="yuvaan";
		s2.age=5;
		count++;
		
		System.out.println("student1 deatils :"+ s1.name +" " +s1.age);
		System.out.println("student2 deatils :"+ s2.name +" " +s2.age);
		System.out.println(" total number of students are : " + count);
		
		s2.age=7;
		System.out.println("student2 updated deatils :"+ s2.name +" " +s2.age);
		
		Student s3=new Student();
		s3.name="karthik";
		s3.age=40;
		count++;
		System.out.println("student3 deatils :"+ s3.name +" " +s3.age);
		System.out.println(" total number of students are : " + count);
		
		
		
		
		

	}

}
