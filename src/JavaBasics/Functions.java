package JavaBasics;

public class Functions {
	
	//1.Write a program to print the addition/subtraction/division/multiplication of two numbers by defining your own method
	
	
	public void add(int a, int b)
	{
		System.out.println(" adding 2 numbers : " +(a+b));
	}
	
	public int sub(int a, int b)
	{
		return(a-b);
	}
	
	public void mult(int a, int b)
	{
		System.out.println(" mult 2 numbers :" +(a*b));
	}
	
	public void div(int a, int b)
	{
		System.out.println(" div 2 numbers :" +(a/b));
	}
	
	
	//2 Define a method that returns the product of two double numbers.
	
	
	
	public void mult (double x, double y)
	{
		System.out.println(" mult of 2 double numbers :" +(x*y));
	}
	
	public static void main(String[] args) {
		
		Functions calc= new Functions();
		calc.add(4, 5);
		int ans=calc.sub(4, 5);
		System.out.println("sub of 2 numbers are :" +ans);
		calc.mult(4,5);
		calc.div(10,5);
		calc.mult(12.5,10.5);
		
		
		
		
		
		
	
		
		
		
		

	}

}
