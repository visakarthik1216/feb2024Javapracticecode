package naveenSelenium;

public class Widening {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//byte-->short..>int...>lomg---> floa 
		
		//if-else
	// greatest of 3 different numbers
		int a=25;
		int b=78;
		int c=87;
		if (a>b && a>c)
		{
			System.out.println("A is greatest");
		}
			else if(b>c)
			{
				System.out.println("b is greatest");
			}
				else
				{
					System.out.println("The greatest number is"+c);
			}
		
		
		// greatest of 4 different numbers
		
		int a1=25;
		int b1=78;
		int c1=87;
		int d1=97;
		
				if (a1>b1 && a1>c1 && a1>d1)
				{
					System.out.println("a is gretaes");
				}
				else if (b1>c1&& b1>d1)
				{
					System.out.println(" b is greates");
				}
				else if (c1>d1)
				{
					System.out.println(" c is greatest");
				}
				else
				{
					System.out.println("d is greatest");
				}
					
				
		// positive and negative
				int x=-11;
				int y=35;
				
				if (x ==0)
				{ 
					System.out.println(" the number is 0");
					
				}
				else if(x>0)
				{
					System.out.println(" the number is positive");
				}
				else
					
				{
					System.out.println(" the number is negative");
				}
		
					
				
	
	//odd or even
	
	          int z=5;
	         
	          if (z % 2 ==0)
	          {
	        	  System.out.println(" the numbe is even");
	          }
	          else
	          {
	        	  System.out.println(" the number is odd");
	          }
	          
	 // vowel or consonant using switch case
	          char ch='c';
	          switch(ch)
	          {
	          case 'a':
	          
	        	  System.out.println( ch+ "is a vowel");
	        	  break;
	          
	          case 'e':
	          
	        	  System.out.println( ch+ "is a vowel");
	              break; 
	          case 'i':
	          
	        	  System.out.println( ch+ "is a vowel");
	        	  break;
	          
	          case 'o':
	          
	        	  System.out.println( ch+ "is a vowel");
	        	  break;
	          
	          case 'u':
	          
	        	  System.out.println(ch+ "is a vowel");
	        	  break;
	        	  
	        default:
	        	System.out.println(ch+ " is a consonant");
	          break;
	        	  
	          }
	          
	   //WAP to run your test cases in a specific environment like: QA, Stage, Dev, UAT, Prod using using Switch - Case
	          
	          String env ="Dev";
	          switch (env)
	          {
	          case "QA":
	        	  System.out.println(" QA environment");
	        	  break;
	        	  
	          case "Dev":
	        	  System.out.println(" dev environment");
	        	  break;
	        	  
	          case "Stage":
	        	  System.out.println(" stage environment");
	        	  break;
	        	  
	          case "UAT":
	        	  System.out.println(" uat environment");
	        	  break;
	        	  
	          case "PROD":
	        	  System.out.println(" prod environment");
	        	  break;
	        	  
	           default:
	        	   System.out.println(" please enter correct env");
	        	   break;
	        	  
	        	  
	          
	          }
	          
	    //WAP to launch browsers using If-ElseIf and Switch Case.

          //Browser: Chrome/Firefox/IE/Safari

           //If user passes wrong browser, print please pass the right browser name

	          String browser ="edge";
	        		  if (browser == "chrome")
	        		  {
	        			  System.out.println(" this is chrome browser");
	        		  }
	        		  else if(browser=="firefox")
	        		  {
	        			  System.out.println(" tis  is ff browser");
	        		  }
	        		  else if(browser ==" IE")
	        		  {
	        			  System.out.println(" this is IE browser");
	        		  }
	        		  else if (browser =="Safari")
	        		  {
	        			  System.out.println(" this is safari browser"); 
	        		  }
	        		  else
	        		  {
	        			  System.out.println(" please pass right browser");
	        		  }
	          
	        		  
	       // switch case
	        		  
	        		  String browser1="IE";
	        		  
	        		  switch (browser1)
	        		  {
	        		  case "chrome":
	        		  {
	        			 System.out.println("thi is chrome broswer ");
	        			 break;
	        			 
	        		  }
	        		  case "safari":
	        		  {
	        			 System.out.println("thi is safari broswer ");
	        			 break;

	        		  }
	        		  case "IE":
	        		  {
	        			 System.out.println("thi is IE broswer ");
	        			 break;
	        			 
	        		  }
	        		  case "firefox":
	        		  {
	        			 System.out.println("thi is firefox broswer ");
	        			 break;
	        			 
	        		  }
	        		  
	        		  
	        		  default:
	        			  System.out.println(" please pass correct browser");
	        		  }
	        		  
	        		  
	        		  //WAP to define the interest rate on the basis of Loan type using Switch Case

	        		  //Loan Type: Car Loan, Housing Loan, Personal Loan, Education Loan

	        		  //For Housing Loan, if user’s salary is less than 35000 USD - print : NOT APPLICABLE FOR Housing Loan	  
	        		  
	        
	        		  String loantype ="Houseloan";
	        		  int salary=40000;
	        		  double interestRate=0.0;
	        		  switch(loantype)	
	        		  {
	        		  case "Houseloan":
	        		  	  if (salary < 35000)
	        			  {
	        				  System.out.println(" not applicable for houseloan");
	        			  }
	        			  
	        				interestRate=7.5;
	        				  break;
	        			  	        			
	        		  
	        		  case "Carloan":
	          			  interestRate=6.5;
	        		       break;
	        		  
	        		  default:
	        		  System.out.println(" no loan type of specified type");
	        		  break;
	        		  }
	        		  
	        		  System.out.println("the interest rate for" +loantype + "is" +interestRate +"%");
	        		  
	        		  
	          
		}
}


		

	



