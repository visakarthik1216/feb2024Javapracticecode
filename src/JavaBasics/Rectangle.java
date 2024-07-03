package JavaBasics;

public class Rectangle {
	double length;
	double width;
	
	public Rectangle()
	{
		length=0.0;
	    width=0.0; 
	}
	
	public Rectangle(double length, double width)
	{
		//this.length=length;
		//this.width=width;
		
		
		
	}
	
	public double calculateArea()
	{
		double area= this.length*this.width;
		return area;
	}

	public static void main(String[] args) {
		Rectangle ob=new Rectangle();
		System.out.println(" the area of 1st rectangle is :" +ob.calculateArea());
		Rectangle ob1=new Rectangle(2.5,3.5);
	System.out.println(" the area of 2nd rectangle is :" +ob1.calculateArea());
		
		
		
		

	}

}
