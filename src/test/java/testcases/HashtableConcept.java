package testcases;

import java.util.Hashtable;

public class HashtableConcept {
	
	public static void main(String[] args) {
		
		Hashtable<Integer,String> h = new Hashtable<Integer,String>();
		h.put(1, "Age");
		h.put(2, "100");
		h.put(3,"test");
		System.out.println(h.size());
		
	
		
		System.out.println(h.get(1));


}
}