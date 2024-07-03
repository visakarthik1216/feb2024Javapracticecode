package naveenSelenium;

public class DataTypesAssignment {

	public static void main(String[] args) {
		
		//question 1
		
		String a="Hello";
		String b="Naveen K";
		System.out.println(a+" "+b);
		
		//question 2
		
		byte a1=74;
		byte b1=36;
		int c1=a1+b1;
		System.out.println(c1);
		
		//question 3
		
		byte i=50;
		byte j=3;
		int k=i/j;
		System.out.println(k);
	
		
		//question 4
		
		double f=((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
		System.out.println(f);
		
		// question 5
		
		String x="Hello Selenium";
		String y ="t" ;
		System.out.println(x+" "+y);
		
		//question 6
		
		short  x1=100;
		short y1=200;
		short z1=3400;
		int ans=x1+y1+z1;
		System.out.println("Your total amount is "+ ans);
		
		// question 7
		char c2='h';
		System.out.println(c2);
		System.out.println(0+c2);
		
		//question 8
		char c3='d';
		int c4=3+c3;
		System.out.println((char)c4);
		
		// question 9
		
		double d1=3.9;
		System.out.println(Math.pow(d1,2));
		
		
		//increment dec operators
		//1 answer is 24
        int i2 = 11;
		
		int i3 = i2++ + ++i2;
		
		System.out.println(i3);
		
		//2 answer is 103
		
        int a3=11, b3=22, c;
		
		c = a3 + b3 + a3++ + b3++ + ++a3 + ++b3;
		
		System.out.println("a="+a3);
		System.out.println("b="+b3);
		System.out.println("c="+c);
		
		//3 answers is 0
		
		int m1=0;
		m1=m1++- --m1+ ++m1- m1--;
		System.out.println(m1);
		
		// 4 answer boolean b cannot be incremented
		//5 answers are i=0;j=1;k=2; m=-4
		
		
		
		
		
		
  
		
		
		
		
		
		
				
		

	}

	private static char[] Square(double d1) {
		// TODO Auto-generated method stub
		return null;
	}

}
