package OOPConceptpart1;

public class MethodOverloading {

	public static void main(String[] args) {
		
		 MethodOverloading m= new  MethodOverloading();
		 m.sum();
		 m.sum(5);
		 
		 m.sum("hai");
		 m.sum(5,2);
	}

	public void sum()
	{
		System.out.println("test method");
	}
	
	public void sum(int i)
	{
		System.out.println("test1 method");
		System.out.println(i);
	}
	
	public void sum(String s)
	{
		System.out.println("test2 method");
		System.out.println(s);
	}
	public void sum(int i, int j)
	{
		System.out.println("test3 method");
		System.out.println(i+j);
	}
}
