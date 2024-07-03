package JavaBasics;

import java.util.Arrays;

public class TestMethods {
	
	int a;
	int b;
	String s1;
	String s2;
	
	
	public void print()
	{
	System.out.println("Hello World");
	
	}
	
	public int add(int a, int b)
			{
		      return a+b;
			}
	
	public boolean strcomp(String s1,String s2)
	{
		if (s1==s2)
		{
			return true;
		}
			else
			{ 
				return false;
			}
		}
	
	//Write a method to calculate the average of elements in a double array and return the result.
 public double avg(double d[])
 
 {
	 double sum=0.0;
	 for (double e:d)
	 {
			
		sum=sum+e;
			
	 }
		return sum/d.length;
			 
 }
 
 public String concat(String s[])
 {
	 String finalstr=" ";
	 for(String s1:s)
	 {
	    finalstr=finalstr+s1;
	 }
	 return  finalstr;
 }
 
 public Object[] reverse(Object ob2[])
 {
	int length= ob2.length;
	 Object revArray[]= new Object[length];
	 int count=0;		 
	 for (int i=ob2.length-1; i>=0; i--)
	 {
		 revArray[count]=ob2[i];
		 count++;
		 
	 }
	 return revArray;
 }
 
        
	
// public int[] factmult(int i,int j[])
// 
// {
//	int length=j.length;
//	 int k1[]= new int[length];
//	 int count=0;
//	 for (int x=0;x<j.length;x++)
//	 {
//		 k1[count]=j[x]*i;
//		 count++;
//				 
//	 }
//	 return k1;
//	 
// }
	
public void factmult(int i,int j[])
 
 {
	
	 for (int x=0;x<j.length;x++)
	 {
		System.out.println(j[x]*i+ " ");
		
		
				 
	 }
	
	 
 }


public void message (String msg ,boolean b)
{
	if (b)
	{
		System.out.println("success :" + msg);
	}
	else
	{
		System.out.println("failure :" + msg);
	}
			
}

public void printrevstring(String s[])
{
	for (int i=s.length-1;i>=0; i--)
	{  
		System.out.println(s[i]+ " ");
		
	}
	
}


	public static void main(String[] args) {
		
		TestMethods ob= new TestMethods();	
				
		ob.print();
		System.out.println(" The answer is : " + ob.add(4, 5));
		System.out.println(" Strings are same : " + ob.strcomp(" ", " "));
		double d1[]= {1.5,2.5,3.5,4.5};
		double ans1=ob.avg(d1);
		System.out.println(" thr avg of element is "+ans1);
		String str[]= {" abc", "def","ghi"};
		String finstr=ob.concat(str);
		System.out.println(finstr);
		Object originalArray[]= {"123" ,"abc", 'e', 56, 45.5};
		Object reversedArray[]= ob.reverse(originalArray);
		System.out.println(Arrays.toString(reversedArray));
		int array[]= {1, 2,3,4};
		ob.factmult (2,array);
		//int newfactor[]=ob.factmult (2,array);
		
		//System.out.println(Arrays.toString(newfactor));
		ob.message(" operation success", true);
		ob.message(" operation failure", false);
		String s[]= {"abc", "defg", "ghi"};
		ob.printrevstring(s);
		
		}
		
		
		

	}


