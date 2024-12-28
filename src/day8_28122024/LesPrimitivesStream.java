package day8_28122024;

import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LesPrimitivesStream {

	public static void main(String[] args) {
		/*
		Stream<Integer> stream = Stream.of(1, 2, 3);
		System.out.println(stream.mapToInt(x -> x).sum());
		
		IntStream intStream = IntStream.of(1, 2, 3);
		OptionalDouble avg = intStream.average();
		System.out.println(avg.getAsDouble());
		
		IntStream range = IntStream.range(1, 6);
		range.forEach(System.out::println);
		
		IntStream rangeClosed = IntStream.rangeClosed(1, 5);
		rangeClosed.forEach(System.out::println); 
		*/
		Stream<Integer>numbers = Stream.of(12,null,3);
		IntStream ints = numbers.mapToInt(x->x.intValue());
		ints.forEach(System.out::println);
	}

}
