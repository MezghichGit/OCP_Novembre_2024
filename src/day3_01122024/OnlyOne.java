package day3_01122024;

public enum OnlyOne {
	ONCE(true),TWO(false);  // static final

	private OnlyOne(boolean b) {
		System.out.println("constructing : " +b);
	}
}