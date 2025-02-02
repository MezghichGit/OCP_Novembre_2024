package qcm1;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Q9 {

	public static void main(String[] args) {
		
		List<Integer>names = Arrays.asList(1,2,3);
		
		names.forEach(x->x=x+1);
		//System.out.println(names);
		
		names.forEach(System.out::println);
		BiFunction<Integer,Integer,Double> bf = (a,b)->(double)a/b;
		//List<String>strString = Arrays.asList("a","aa","aaa");
		//Consumer<String> c = x->System.out.println("Length : "+x);
		//strString.forEach(c);
		
		List<StringBuilder>namesSB = Arrays.asList(new StringBuilder("1"),new StringBuilder("2"),new StringBuilder("3"));
		
		namesSB.forEach(x->x=x.append("A"));
		//System.out.println(names);
		
		namesSB.forEach(System.out::println);
		
	}

}
