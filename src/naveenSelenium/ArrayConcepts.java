package naveenSelenium;

import java.util.Arrays;

public class ArrayConcepts {

	public static void main(String[] args) {
		int p[]= {12, 1, 22,3};
		System.out.println(p.length);
		System.out.println("lo" +0);
		System.out.println("hi" + (p.length-1));
		System.out.println(p[0]);
		System.out.println(p[3]);
		int a[]=new int[p.length-1];
		
		int j=0;
		for (int i=0; i<p.length-1;i++)
		{
			if (p[i]!=22)
			{
				j++;
				a[j]=p[i];
				
			}
		}
		
		System.out.println(Arrays.toString(a));
		
		// static array for cricket palayers
		
		Object a1[]= {"Rohit", 22,"India","08-02-2000",'M', 5.62};
		Object a2[]= {"dravid", 24,"India","7-2-1981",'M', 7.20};
		Object a3[]= {"scahin", 28,"India","9-6-1978",'M', 8.20};

		for(Object e: a1)
		{
			System.out.println(e);
		}
		
		for(Object e3: a2)
		{
			System.out.println(e3);
		}
		
		
		
		for(int i=0;i<a1.length-1;i++)
		{
			System.out.println(a1[i]);
			System.out.println(a2[i]);
			System.out.println(a3[i]);
			
						
		}
		
		//Q3: Print all the elements of this array using for, for each, while and do-while loop:

			int p1[] = {1,3,4,5,22,56,89,90};
			
			System.out.println(Arrays.toString(p1));
			
			for (int x:p1)
			{
				System.out.println(x); 
				
			}
			
			System.out.println("...............................");
		
			System.out.println(p1.length);
			 for (int c=0; c<p1.length; c++)
			 {
				 System.out.println(p1[c]);
			 }
			 
			 System.out.println("using while loop");
			 
			 int p3[] = {1,3,4,5,22,56,89,90};
			 int c=0;
			 while( c<p3.length)
			 {
				 System.out.println(p3[c]);
				 c++;
			 }
			 
			 System.out.println(" do while loop");
			 
			 int c3=0;
			 do{ 
			 System.out.println(p3[c3]);
			 c3++;}
			 while(c3<p3.length);
			 
			 
			// Q4: Print all the elements of this array in reverse order using for, for each, while and do-while loop:
			 
			 System.out.println(" reverse order");

				 int y[] = {1,3,4,5,22,56,89,90};
				  
				 for (int k=y.length-1; k>=0; k--)
				 {
					 System.out.println(y[k]);
				 }
					
				 System.out.println("for each loop");
				 
				 
				 int count=y.length-1;
				
				 for (int z:y)
				 {
					 z=count;
					 System.out.println(y[z]);
					 count--;
				 }	 
				 
				 System.out.println("while loop");
				 int hi=y.length-1;
				 
				 while(hi>=0)
				 {
					 System.out.println(y[hi]);
					 hi--;
				 }
				 
				 System.out.println(" do while loop");
				 int t=y.length-1;
				 
				 do
				 {
					 System.out.println(y[t]);
					 t--;
				 }
				 while(t>=0);
			
				 
				 
						 
			 
			 
					
	}
}

		
