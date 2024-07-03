package naveenSelenium;

public class loop4 {

	public static void main(String[] args) {
		
		//Even Numbers Series: Write a Java program to print the series of even numbers from 2 to 100.
		//int num=2;
		//for (int i=1; i<=100;i++)
		//{
		//	System.out.println(i*num);
		//}
		
		
		for (int i=2; i<=100;i++)
		{
			if (i%2==0)
			{
				System.out.println(i +" is a even number");
			}
		}
		int i=2;
		while(i<=100)
		{
			if (i%2==0)
			{
				System.out.println(i +" is a even number");
				
			}
			i++;
		}
        
		for ( char ch='z'; ch>='a';ch--)
		{
			System.out.println(ch);
		}

		for ( float f=1.0f; f<=10.0;f++)
		{
			System.out.println(f);
		}
		
		int num=9;
		for ( int x=0; x<12;x++)
		{
			System.out.println(x*num);
		}
		
		int num1=9;
		int i1=0;
		while (i1<12)
		{
			System.out.println(i1*num1);
			i1++;
		}

	}
}
