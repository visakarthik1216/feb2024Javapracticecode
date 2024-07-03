package JavaBasics;

public class Circle {
	
	//3.Write a program to print the circumference and area of a circle of radius entered by user by defining your own method. 
	//circum=2pir
	// are of circle of radius-c/2pi
	
	int radius;
	
	
	public double cirucmference( int radius)
	{
		double circum= 2*Math.PI*radius;
		return circum;
	}
	
	public double areaofcir(double ans)
	{
	double ac=ans/2*Math.PI;
	return ac;
	}

	public static void main(String[] args) {
	Circle c=new Circle();
	double ans=c.cirucmference(6);
	System.out.println("The cirucumference of the circle is " +ans);
	double ans1=c.areaofcir(ans);
	System.out.println("The area of the circle is " +ans1);
		

	}

}
