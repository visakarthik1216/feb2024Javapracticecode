package naveenSelenium;

public class IncrementDecrement {

	public static void main(String[] args) {
		
		// 6 answer is 0
		int a=1,b=2;

		System.out.println(--b - ++a + ++b - --a);
		
		//7 answers are i=18; j=28; k=-1 and m=-10
		
		int i=19, j=29, k=0;



		int m = i-- - j-- - k--;

		System.out.println("i="+i);

	    System.out.println("j="+j);

		System.out.println("k="+k);
		System.out.println("m="+m);
		
		//8 answer is already it is 11 in memory its 12,then again decrement its 11
		//9.p=1;n=-2;m=-2
		//10.i am getting answer has 6 but compiler is showing 5
		
		int c=1;
	

	c = c++ + ++c * --c - c--; 
	System.out.println(c);
	
	//11 answer is compiler error- has increment and decremnt operator can be applied on variables
	
	//int z=11++;
	//System.out.println(z);
	
	//12 answer is 65
	
	int ch='A';
	System.out.println(ch++);
	
	//13
	
	char ch1 = 'A';

    
    System.out.println(++ch1);
	
	
	

	
		

}
	
}

