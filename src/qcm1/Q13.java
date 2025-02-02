package qcm1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Q13 {

	public static void main(String[] args) {
		List<Integer> ls = Arrays.asList(1,2,3);
		Function<Integer,Integer> func = a->a*a;
		ls.stream().map(func).peek(System.out::print);//.forEach(System.out::println);

	}

}
