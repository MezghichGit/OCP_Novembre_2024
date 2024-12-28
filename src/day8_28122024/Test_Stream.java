package day8_28122024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test_Stream {

	public static void main(String[] args) {
		//Stream<Double> randoms = Stream.generate(Math::random);
		//randoms.limit(10).forEach(System.out::println);
		
		//Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);
		//oddNumbers.limit(10).forEach(System.out::println);
		
		//System.out.println(randoms);
		//Stream<String> stream = Stream.of("w", "o", "l", "f");
		//String word = stream.reduce("", (s, c) -> s + c);
		//System.out.println(word); // wolf 
		
		//Stream<String> stream = Stream.of("w", "o", "l", "f");
		//List<String> set = stream.collect(Collectors.toCollection(ArrayList::new));
		//System.out.println(set);
		
		//Stream<Integer> s = Stream.iterate(1, n -> n + 1);
		//s.skip(5).limit(2).forEach(System.out::print); // 6  7 
		//Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
		//s.map(String::length).forEach(System.out::print); 
		/*
		List<String> zero = Arrays.asList();
		List<String> one = Arrays.asList("Bonobo");
		List<String> two = Arrays.asList("Mama Gorilla", "Baby Gorilla");
		Stream<List<String>> animals = Stream.of(zero, one, two);
		animals.flatMap(l -> l.stream()).forEach(System.out::println);
		 */
		//Stream<String> s = Stream.of("brown bear-", "grizzly-");
		//s.sorted(Comparator.reverseOrder()).forEach(System.out::print); // grizzly-brown bear
		
		//s.sorted(Comparator::reverseOrder);
		
		List<String> list = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
		list.stream().filter(n -> n.length() == 4).sorted().limit(2).forEach(System.out::println); 


	}

}
