package testcases;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylistpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList ar = new ArrayList();
		ar.add("thalla");
		ar.add("ayyappa");
		ar.add("jacke");
		
		Iterator i =ar.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}