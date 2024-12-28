package day7_22122024.methodesReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class AddsOnJava8 {

	public static void main(String[] args) {
		// 1) removeIf
		/*
		List<String> names = new ArrayList<>();
		names.add("mehdi");
		names.add("amine");
		names.add("salma");
		names.add("marwa");
		System.out.println(names);
		
		Predicate<String> filter = (String s)->s.contains("i");
		names.removeIf(filter);
		System.out.println(names);
		*/
		
		// 2)replaceAll
		/*
		UnaryOperator<Integer> uop = (Integer x)->x*x;
		List<Integer> numbers = new ArrayList<>();
		numbers.add(2);
		numbers.add(4);
		numbers.add(3);
		System.out.println(numbers);
		numbers.replaceAll(uop);
		System.out.println(numbers);
		*/
		
		// 3)forEach
		
		List<String> cats = Arrays.asList("Annie", "Ripley");
		//for(String cat: cats)
			//System.out.println(cat);
		
		//cats.forEach(c -> System.out.println(c));
		//cats.forEach(System.out::println);
		
		// 4)merge; putIfAbsent(),  dans Map
		/*
		Map<String, String> favorites = new HashMap<>();
		favorites.put("Jenny", "Bus Tour");
		favorites.put("Jenny", "Tram");
		System.out.println(favorites); // {Jenny=Tram}
		*/
		/*
		Map<String, String> favorites = new HashMap<>();
		favorites.put("Jenny", "Bus Tour");
		favorites.put("Tom", null);
		favorites.putIfAbsent("Jenny", "Tram");
		favorites.putIfAbsent("Sam", "Tram");
		favorites.putIfAbsent("Tom", "Tram");
		System.out.println(favorites); */// {Tom=Tram, Jenny=Bus Tour, Sam=Tram}
		
		BiFunction<String,String,String> mapper =(s1,s2)->s1.length()>s2.length()?s1:s2;
		
		Map<String, String> favorites = new HashMap<>();
		favorites.put("Jenny", "Bus Tour");
		favorites.put("Tom", "Tram");
		System.out.println(favorites);
		
		String jenny = favorites.merge("Jenny", "Skyride", mapper);
		System.out.println(jenny);
		String tom = favorites.merge("Tom", "Skyride", mapper);
		System.out.println(tom);
		System.out.println(favorites);
		BinaryOperator<String> b2 = (string, toAdd) -> string.concat(toAdd); 


	}

}
