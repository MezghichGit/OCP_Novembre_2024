package day2_24112024.OverrideObjectMethods;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		/*
		ArrayList al = new ArrayList();
		System.out.println(al); // []
		System.out.println(al.toString()); // []
		
		Animal a = new Animal();
		System.out.println(a);
		System.out.println(a.toString());
		*/
		String s1 = new String("lion");
		String s2 = new String("lion");
		System.out.println(s1.equals(s2)); // true
		
		StringBuilder sb1 = new StringBuilder("lion");
		StringBuilder sb2 = new StringBuilder("lion");
		System.out.println(sb1.equals(sb2)); // false
		
		Lion l = new Lion(1);
		Lion l2 = new Lion(2);
		System.out.println(l.equals(l2)); // equals de Lion
		
		System.out.println(l.equals(sb1)); // equals de Object
		


	}

}
