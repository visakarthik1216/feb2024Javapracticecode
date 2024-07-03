package JavaBasics;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		
		ArrayList a= new ArrayList();
		a.add(10);
		a.add(20);
		ArrayList<Integer> ar=new ArrayList<Integer>();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		
		System.out.println(ar.size()); //to get size
		System.out.println(ar.get((3)));//to get one value
		
		System.out.println(ar);
		 for(Integer e:ar){
		 
			 System.out.println(e);
			 
			 
		 }

	}

}
