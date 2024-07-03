package JavaBasics;

public class Stringsplit {

	public static void main(String[] args) {
		
		String s1="this is my java code";
		String s2[]=s1.split(" ");
		String answer="";
		for(String e:s2)
		{   
			
			 answer=answer+StringRev.revString(e)+" ";
				
		}
		System.out.println(answer.trim());
		
		String s3= "this is my first code";
		 String s4[]=s3.split(" ");
		 
		 String answer1="";
		 
		 for (String e:s4)
		 {
			 answer1=answer1+e.replace(String.valueOf(e.charAt(0)),String.valueOf(e.charAt(0)).toUpperCase())+" ";
		
			
		 }
		 String revans[]=answer1.split(" ");
		
		 String answer2="";
		 for(String e:revans)
			{   
				
				 answer2=answer2+StringRev.revString(e)+" ";
					
			}
		 
		 
		 System.out.println(answer2); 
		
		
		
		
		
		

	}

}
