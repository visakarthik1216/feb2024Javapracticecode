package OOPConceptpart1;

public class CallbyvalueCallbyref {
	int p=50;
	int q=60;


	public static void main(String[] args) {
		int x=10;
		int y=20;
		CallbyvalueCallbyref ob =new CallbyvalueCallbyref();
		ob.sum(x,y);
		System.out.println(x);	
		System.out.println(ob.p);
		System.out.println(ob.q);
		ob.swap(ob);
		System.out.println(ob.p);
		System.out.println(ob.q);
		
	
		

	}
	
	public void sum(int x, int y)
	{
		x=20;
		int c=x+y;
		System.out.println(c);
		
	}
	
	public void swap(CallbyvalueCallbyref t)
	{
		int temp=t.p;//temp=50
		t.p=t.q; // t.p=60
		t.q=temp; // t.p=50
		
	}

}
