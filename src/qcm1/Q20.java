package qcm1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q20 {

	public static void main(String[] args) {
		List<String> letters = Arrays.asList("j","a","v","a");
		
		//String word = letters.stream().reduce("", (a,b)->a.concat(b));
		String word = letters.stream().collect(Collectors.joining());
		System.out.println(word);

	}

}
