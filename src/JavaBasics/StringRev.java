package JavaBasics;

public class StringRev {
	
	public static String revString (String s1) 
	
		{
		
		if (s1==null)
		{
			return s1;
		}
		
		if(s1.isBlank()|| s1.isEmpty())
		{
			return s1;
		}
		
		int len=s1.length();
		
		if (len==1)
		{
			return s1;
		}
		
		
				
		
		String rev= "";
		for (int i=len-1; i>=0;i--)
		{
			rev=rev+s1.charAt(i);
		}
		return rev;
		
		
	}

	public static void main(String[] args) {
		System.out.println(revString("Selenium"));
	    System.out.println(revString("a"));
		System.out.println(revString(" "));
		System.out.println(revString(null));
		
		
		
		
		

	}

}
