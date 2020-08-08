package testcases;

import java.util.ArrayList;
import java.util.Iterator;

public class TestCollections {
	
	//test commit for this file
	
		public static void main (String [ ] args){
			
			int a[]=new int[100];
			a[0]=20;;
			int[] b1= {10,20, 30};
			System.out.println(b1[2]);
			
		ArrayList <String>names=new ArrayList <String>();
		names.add ("apple");
		names.add ("cherry");
		names.add ("kiwi");
		names.add ("banana");
		names.add ("cherry");
		System.out.println (names.size());
		Stringtest();
		names.add("mango");
		System.out.println (names.size());
		names.iterator();
		System.out.println(names.get(3));
		
		
		//creating an object of Arraylist class
				ArraylistdiffrentClassobjects a1= new ArraylistdiffrentClassobjects("Tgalla", 25, "QA");
				ArraylistdiffrentClassobjects a2= new ArraylistdiffrentClassobjects("tanav", 25, "psss");
				ArraylistdiffrentClassobjects a3= new ArraylistdiffrentClassobjects("Tom", 25, "devA");
				
				//Create an arraylist
				
				ArrayList<ArraylistdiffrentClassobjects> ar4 = new ArrayList <ArraylistdiffrentClassobjects>();
				ar4.add(a1);
				ar4.add(a2);
				ar4.add(a3);
				
				//iterator to traverse all the values in the arraylist
				
				Iterator<ArraylistdiffrentClassobjects> it=ar4.iterator();
				while(it.hasNext()) {
					ArraylistdiffrentClassobjects ac=it.next();
					System.out.println(ac.name);
					System.out.println(ac.Age);
					System.out.println(ac.Dept);
				}
		
		
		//names.add(10);
		
		// to print all the values of the array list for loop
		
		for(int i=0;i<names.size();i++) {
			System.out.println(names.get(i));
		}
		

		
		}
		
		

		public static void Stringtest() {
			String S= "tools";
			System.out.println(S.length());
			
			char[] P= {'T','h','a'};
			String r=new String(P);
			System.out.println(r);
			try {
			int[] i= {10,20,40};
							
			System.out.println("the lement at"+i[3]);
		}
		catch(ArrayIndexOutOfBoundsException  c) {
			System.out.println("exception" );
			
		}
		}
		
		
		    }

		
