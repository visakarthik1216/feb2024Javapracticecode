package naveenSelenium;


public class StringTest {
 
	String str1;
	String str2;
	
	
	public void strcomp(String str1,String str2)
	{
		if (str1.equals(str2))
		{
			System.out.println(" strings are equal");
		}
		else
		{
			System.out.println(" strings are not equal");
		}
		
	}
	
	
	//5.Write a function/ method to reverse your own name.
	public void reverse(String c)
	{
		
		for(int i=c.length()-1;i>=0;i--)
		{
		
			char ch=c.charAt(i);
			 System.out.println(ch);
			
		}
		
	}
	
	public int indexOf(String s1)
	{
        return  indexOf(s1);
	}
	
   
   
	
	


	


	public static void main(String[] args) {
		StringTest str=new StringTest();
		str.strcomp("", "");
		String str3=" Hello Everyone ";
		str.reverse("vihaan");
		
		  // String trimstr= str3.trim();
		
		//Remove all  spaces in a String 
		
		   String answer=str3.replace(" ","");
		   System.out.println(answer);
		   
		   //Write a program that will  print out the last character and first character of a word.
		   
		   String a="visa";
		   System.out.println(a.length());
		   System.out.println(a.charAt(0));
		   System.out.println(a.charAt(a.length()-1));
		   
		   //4. Write a program to verify a word or a character contained in the sentence.
		   
		   String b= " i am doing great";
		   if (b.contains("bye"))
				   {
			         System.out.println(" it is matched");
				   }
		   else
		   {
			   System.out.println("not matched");
		   }
		   
		   
		   //6. Write a program that gives you the last half of the string.
		   
		   String c="Hi this is java program";
		  int  mid=c.length()/2;
		  System.out.println(mid);
		 // System.out.println( c.substring(0,mid));
		System.out.println(c.substring(mid));
		   
		   
		//7.Write a program to get the 3rd  “ e “ of the string 
		
		 //8.Write a method which gives an index of (-1) if string is not available. . it should return integer. 
		//if String is present, then it should return the specific index.
		
		String s1= "this is a java program";
		int position=s1.indexOf("no");	
		System.out.println(position);
		

		String s = "Welcome to JavaTpoint";      
		int count = 0;  
		int startFrom = 0;  
		for(; ;)  
		{  
		  
		int index = s.indexOf('o', startFrom);  
		  
		if(index >= 0)  
		{  
		// match found. Hence, increment the count  
		count = count + 1;  
		  
		// start looking after the searched index  
		startFrom = index + 1;  
		}  
		  
		else  
		{  
		// the value of index is - 1 here. Therefore, terminate the loop  
		break;  
		}  
		  
		}  
		  
		System.out.println("In the String: "+ s);   
		System.out.println("The 'o' character has come "+ count + " times");  
		
		
		//Write a program that breaks a whole string into small strings, and prints out its all values . (Hint: split, loop) .
		
		String x= "this is a java program";
		String[] words=x.split("\\s");
		//System.out.println(words);
		for(String w:words) {
			System.out.println(w);
		
			
		}
			
		String y= "i am good";
		System.out.println(y.length());
		int len= y.length()/2;
		System.out.println(len);
		
		 
	       			   
		
		

	}

}
