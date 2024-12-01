package day3_01122024;

class X {
}

public class Outer {

	private String greeting = "Hi";

	private int length = 5;
	private  int x = 5;
	
	public void calculate() {
		 int width = 20; // effectively final
		 
		 class LocalInner { // local inner class
			static int x = 10;
			public static void getX() {
			}
			public void multiply() {
				System.out.println(width * length);
			}
		}
		
		LocalInner localInner = new LocalInner();
		localInner.multiply();
	}

	public abstract class Animal {
	}

	public class Inner { // Nested class
		public int repeat = 3;
		private static int x = 10;

		public static void getX() {
		}

		public void go() {
			/*for (int i = 0; i < repeat; i++) {
				System.out.println(greeting);
			}*/
			System.out.println(x);
		}
	}

	public void callInner() {
		Inner inner = new Inner();
		inner.go();
	}

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.new Inner().go();
		//outer.calculate();
		//outer.callInner();

		//new Outer().new Inner().go();

	}

}
