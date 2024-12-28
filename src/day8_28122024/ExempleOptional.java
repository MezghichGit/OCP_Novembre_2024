package day8_28122024;

import java.util.Optional;

public class ExempleOptional {

	public static Optional<Double> average(int... scores) {
		if (scores.length == 0)
			return Optional.empty();
		int sum = 0;
		for (int score : scores)
			sum += score;
		return Optional.of((double) sum / scores.length);
	}

	public static void main(String[] args) {

		Optional<Double> opt = average(10);
		System.out.println(opt.orElse(Double.NaN));
		System.out.println(opt.orElseGet(() -> Math.random()));
		System.out.println(opt.orElseThrow(() -> new IllegalStateException()));

		// Integer value = 12;
		// Optional<Integer> o = (value== null) ? Optional.empty(): Optional.of(value);

		// Optional<Integer> o = Optional.ofNullable(value);
		// System.out.println(o.get());

		/*
		 * average(10,16).ifPresent(System.out::println);
		 * average().ifPresent(System.out::println);
		 * 
		 * 
		 * Optional<Double> val = average();
		 * 
		 * if(val.isPresent()) System.out.println(val.get()); else
		 * System.out.println("Aucune valeur");
		 */
		/*
		 * Optional<Integer> op = Optional.empty(); Optional<Integer> op2 =
		 * Optional.of(15);
		 * 
		 * // System.out.println(op.get()); // System.out.println(op2.get());
		 * 
		 * op2.ifPresent(System.out::println);
		 * 
		 * if (op.isPresent()) System.out.println(op.get()); else
		 * System.out.println("Aucune valeur");
		 */
	}

}
