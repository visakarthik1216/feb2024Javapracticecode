package JavaBasics;

public class Grade {
	
	int marks;
	
	public void calcGrade( int x)
	{
		if (x<=40)
		{
			System.out.println("your grade is fail");
		}
		 if(x>40&&x<=50)
		{
			System.out.println(" your grrade is DD");
		}
		 
		 if(x>50&&x<=60)
			{
				System.out.println(" your grrade is CD");
			} 
		 
		 if(x>60&&x<=70)
			{
				System.out.println(" your grrade is BC");
			} 
		 
		 if(x>70&&x<=80)
			{
				System.out.println(" your grrade is BB");
			}
		 
		 if(x>80&&x<=90)
			{
				System.out.println(" your grrade is AB");
			} 

		 if(x>90&&x<=100)
			{
				System.out.println(" your grrade is AA");
			} 
		 
	}
	
	public void factorial(int n)//3
	{
		int i=1;
		
		int ans=n*(n-i)*(n-i++);
	}


	public static void main(String[] args) {
		Grade m=new Grade();
		m.calcGrade(100);
		
		

	}

}
