package day6_14122024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		/*int[] numbers = { 6, 9, 1, 8 };
		Arrays.sort(numbers); // [1,6,8,9]
		for (int e : numbers) {
			System.out.print(e + "\t");
		}
		System.out.println();
		System.out.println(Arrays.binarySearch(numbers, 10)); //
		System.out.println(Arrays.binarySearch(numbers, 3)); //
		*/
		/*
		List<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(3);
		list.add(1);
		list.add(2);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		System.out.println(Collections.binarySearch(list, 10));*/
		/*
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);// boxing ou autoboxing
		int x = numbers.get(0); // unboxing
		numbers.add(new Integer(3));
		numbers.add(new Integer(5));
		numbers.remove(1);
		numbers.remove(new Integer(5));
		System.out.println(numbers);*/
		List<String> names = new ArrayList<String>();
		names.add("OCP");
		names.add("true");
		names.add("20");
		for(Object v : names)
		{
			String temp = (String) v;
			System.out.println(temp.length());
		}


		
		
	}

}
