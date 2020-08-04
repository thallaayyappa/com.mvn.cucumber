package testcases;

import java.util.ArrayList;

public class TestCollections {
	
	//test commit for this file
	
		public static void main (String [ ] args){
		ArrayList <String>names=new ArrayList <String>();
		names.add ("apple");
		names.add ("cherry");
		names.add ("kiwi");
		names.add ("banana");
		names.add ("cherry");
		System.out.println (names);
		Stringtest();
		
		
		
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

		
