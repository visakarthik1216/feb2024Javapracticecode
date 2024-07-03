package naveenSelenium;

public class Ascii {

	public static void main(String[] args) {
	
		 for(char ch='a';ch<='z';ch++)
			{
				System.out.println((byte)ch);
			}
		 
		 for (char ch='A'; ch<='Z';ch++)
		 {
			 System.out.println((byte)ch);
		 }
		 
		 for (char ch='0'; ch<='9';ch++)
		 {
			 System.out.println((byte)ch);
		 }
		 char ch='A';
		 while(ch<='Z')
		 {
			 System.out.println((byte)ch);
			 ch++;
			 
		 }
		 
		 

	}
	

}
