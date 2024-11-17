package day1_17112024;

public class TypeImmutable {

	public static void main(String[] args) {
		// Le type String est immutable
		String ch ="ocp";
		System.out.println(ch.concat("spring"));
		System.out.println(ch);
		
		ch = ch.concat("spring");
		
		// Le type StringBuilder est mutable
		StringBuilder sb = new StringBuilder("ocp");
		System.out.println(sb.append("spring"));
		System.out.println(sb);

	}

}
