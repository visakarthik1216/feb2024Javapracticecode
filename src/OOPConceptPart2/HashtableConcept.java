package OOPConceptPart2;

import java.util.Hashtable;

public class HashtableConcept {

	public static void main(String[] args) {
		
		Hashtable h= new Hashtable();
		h.put(1,'A');
		h.put(2,'B');
		h.put(3,'C');
		System.out.println(h.size());
		System.out.println(h.get(2));
		
		Hashtable<Integer,Integer> h1= new Hashtable<Integer,Integer>();
		h1.put(4,100);
	
		
		
		

	}

}
