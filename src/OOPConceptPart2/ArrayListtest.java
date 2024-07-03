package OOPConceptPart2;

import java.util.ArrayList;


public class ArrayListtest {

	public static void main(String[] args) {
		
		ArrayList ar= new ArrayList();;
		ar.add(100);
		ar.add(200);
		ar.add(300);
		ar.add(400);
		System.out.println(ar.size());
		
		ar.add("tom");
		ar.add('D');
		ar.add(25.40);
		System.out.println(ar.size());
		System.out.println(ar.get(3));
		
		for (int j=0; j<ar.size(); j++)
		{
			System.out.println(ar.get(j));
		}

		ArrayList<String> ar1=new ArrayList<String>();
	
		ar1.add("tommy");
		
		
		
		
		

	}

}
