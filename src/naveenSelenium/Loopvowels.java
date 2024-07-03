package naveenSelenium;

public class Loopvowels {

	public static void main(String[] args) {
		//Print only vowels (aeiou) using for and while loop. Start the loop from ‘a‘ to ‘z‘.
		for (char ch='a'; ch<='z';ch++)
		{
			if (ch=='a'||ch=='e'|| ch=='i'||ch=='o'|| ch=='u')
			{
				System.out.println(ch);
			}
		}
		
		for (int i=1; i<=10;i++)
			
		{
			System.out.println(i);
			if (i==7) 
			{
				System.out.println("bye see u tmrw");
				break;
				
			}
			
		}
		int i=1;
		while (i<=10)
		{
			System.out.println(i);
			if (i==7) 
			{
				System.out.println("bye see u tmrw");
				break;
				
			}
			i++;
		}
		
		

		}
		
	}


