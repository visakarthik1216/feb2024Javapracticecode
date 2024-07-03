package JavaBasics;

public class StringTest {

	public static void main(String[] args) {

	// String to int
		
						
				String s="10";
				int a=Integer.parseInt(s);
				System.out.println(a+20);

	// String to Double
				
				String d="12.30";
				double b=Double.parseDouble(d);
				System.out.println(b+10);
				
	//char to string
				char ch='a';
				System.out.println(ch+'b');
				
				System.out.println(String.valueOf(ch)+'b'); 
				
				
		//int to string	
				int a1=20;
				System.out.println(a1+10);
				System.out.println(String.valueOf(a1)+10);
				
				
				boolean b1=true;
				String s1=(String.valueOf(b1));
				System.out.println(s1.length());
				
				
				
				
				
				
				
						
	}

}
