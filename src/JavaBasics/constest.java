package JavaBasics;

import java.util.Arrays;

public class constest {
	int a;
	String b;
	String s[];
	int d;
	
	public constest()
	{
	 System.out.println(" constrcutor with no parameter");
	}
	
	public constest(int a, String b)
	{
		this.a=a;
		this.b=b;
		
		
		System.out.println("constructor with 2 param");
	}

	public constest(String a , int b)
	{
		System.out.println("constructor with 2 param");
	}
	
	public constest(String s[])
	{
		this.s=s;
		System.out.println("constructor with string devices");
	}
	

	public static void main(String[] args) {
		
		constest e= new constest();
		constest e1= new constest(2,"visa");
		System.out.println(e1.a);
		System.out.println(e1.b);
		String s1[]= {"keyboard", "mac", "iphone"};
		constest e2=new constest(s1);
		System.out.println(Arrays.toString(e2.s));

	}

}
