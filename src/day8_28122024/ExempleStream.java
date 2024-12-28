package day8_28122024;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ExempleStream {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Chahir");
		names.add("Majd");
		names.add("Salma");
		names.add("Mehdi");
		names.add("Marwa");
		names.add("Mahdi");
		names.add("Abdallah");
		names.add("Islem");
		System.out.println(names);

		//Stream<String> s = names.stream(); // source method
		//s.filter(name -> name.length() > 5).peek(System.out::println).forEach(System.out::println); // operation intermediaire : filter; 
		// operation terminale : foreach
		
		Stream<String> s = names.stream();
		long result = s.filter(name -> name.length() > 5).peek(System.out::println).count();
		s.forEach(System.out::println);
		System.out.println(result);

	}

}
