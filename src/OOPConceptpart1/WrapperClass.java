package OOPConceptpart1;

public class WrapperClass {

	public static void main(String[] args) {
		
		String s ="200";
		System.out.println(s+20);
		int a=Integer.parseInt(s);
		System.out.println(a+20);
		
		String s1 ="50.55";
		System.out.println(s1+2);
		Double b=Double.parseDouble(s1);
		System.out.println(b+20);
		
		//int to string
		
		int j=100;
		System.out.println(j+10);
		String s2= String.valueOf(j);
		System.out.println(s2+10);
		
		char a1='a';
		System.out.println(a1+'b');
		String ss=String.valueOf(a1);
		System.out.println(ss+"bcd");
		
		
		
		
		

	}

}


