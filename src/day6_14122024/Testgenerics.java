package day6_14122024;

import java.util.ArrayList;

public class Testgenerics {
	
	public static <T> T  operation(T t1)
	{
		System.out.println(t1);
		return t1;
	}

	public static void main(String[] args) {
		
		operation("OCP");
		operation(12);
		operation(true);
		
		
		Crate<String> cs = new Crate<>();
		Crate<Integer> ci = new Crate<>();
		
		ArrayList<String>as;
		ArrayList<Integer>ai;
		
		int x = 100_000;
		double y = 12.5;

	}

}
