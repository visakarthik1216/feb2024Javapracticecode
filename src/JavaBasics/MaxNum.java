package JavaBasics;

public class MaxNum {
	
	
	public int max(int a, int b, int c)
	{
		if (a>b&& a>c)
		{
			System.out.println("a is greater");
			return a;
		}
			else if (b>c)
			{
				System.out.println("b is greater");
				return b;
			}
			else
			{
				System.out.println(" c is greater");
				return c;
			}
		
		}
	
	public int min(int a, int b, int c)
	{
		if (a<b&& a<c)
		{
			System.out.println("a is lesser");
			return a;
		}
			else if (b<c)
			{
				System.out.println("b is lesser");
				return b;
			}
			else
			{
				System.out.println(" c is lesser");
				return c;
			}
		
		}
	
	
	//5. Def﻿ine a program to find out whether a given number is even or odd - return true/false.
	
	public boolean oddeven(int a)
	{
		if(a/2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//6.A person is eligible to vote if his/her age is greater than or equal to 18.
	// Define a method to find out if he/she is eligible to﻿ vote. - return true/false
	
	public boolean vote (int x)
	{
		
		if (x>=18)
		{
			return true;
			
		}
		else 
		{
			return false;
		}
		
	}


	public static void main(String[] args) {
		MaxNum m= new MaxNum();
		int max1=m.max(4, 5, 6);
		System.out.println(" The maximum number of all the 3 numbers are "+ max1);
		int min1=m.min(4, 5, 6);
		System.out.println(" The mimimum number of all the 3 numbers are "+ min1);
		boolean ans= m.oddeven(5);
		if (ans==true)
		{
			System.out.println(" the number is even");
		}
		
			else 
			{
				System.out.println("the number  is odd");
			}
		boolean eligible=m.vote(18);
		if (eligible==true)
		{
			System.out.println("you are eligible to vote since ur age is ");
		}
		else
		{
			System.out.println(" you are not eligible to vote");
		}
		}
	

	}
	


