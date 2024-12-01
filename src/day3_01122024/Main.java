package day3_01122024;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		/*
		ArrayList ls = new ArrayList();
		System.out.println(new ArrayList());
		System.out.println(ls); // []
		System.out.println(ls.toString()); // []
		System.out.println(new String[0]); // [Ljava.lang.String;@65cc892e}
		*/
		/*
		int i =10;
	    short j= i;
	     
	    final  int k =10;
	    short m=k;*/
		
		String s1 = new String("lion");
		String s2 = new String("lion");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s1.equals(s2)); // true
		
		StringBuilder sb1 = new StringBuilder("lion");
		StringBuilder sb2 = new StringBuilder("lion");
		System.out.println(sb1.equals(sb2)); // false
		
		System.out.println(sb1.equals(s1));
		

	}

}
