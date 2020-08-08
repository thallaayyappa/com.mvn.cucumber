package testcases;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList <String> ll = new LinkedList<String>();
		//
		ll.add("thalla");
		ll.add("ayyappa");
		ll.add("SElenojum");
		//
		
		System.out.println(ll);
		
		ll.addFirst("this is First");
		ll.addLast("Thisnis last");
		System.out.println(ll);
		ll.set(2, "this is setiing");
		System.out.println(ll.get(0));
		System.out.println(ll.get(2));
		//for loop, iterator, advance for loop
		
		for(int i=0;i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
	//using advance for loop
		System.out.println("************advacne for loop");
		for(String str:ll) {
			System.out.println(str);
		}
	//using iterator
		
		System.out.println(",,,,,,,,,,,,,,,Iterator");
		Iterator<String>it =ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	
		// while loop
		System.out.println("::::::::::::while loop");
		int num=0;
		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
		}
		
		
	}
	

}
