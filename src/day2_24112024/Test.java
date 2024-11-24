package day2_24112024;


class HeavyAnimal { }
class X extends HeavyAnimal implements Mother {}
class Hippo extends X { }
class Elephant extends HeavyAnimal { }
interface Mother {}

public class Test {

	public static void somme(int x, int y) {
		System.out.println("int x, int y");
	}

	public static void somme(double x, double y) {
		System.out.println("double x, double y");
	}

	public static void somme(short x, short y) {
		System.out.println("short x, short y");
	}

	public static void somme(float x, float y) {
		System.out.println("float x, float y");
	}

	public static void somme(Integer x, Integer y) {
		System.out.println("Integer x, Integer y");
	}

	public static void somme(int... tab) {
		System.out.println("int ... tab");
	}

	public static void main(String[] args) {
		
		HeavyAnimal hippo = new Hippo();
		boolean b1 = hippo instanceof Hippo; // true
		boolean b2 = hippo instanceof HeavyAnimal; // true
		boolean b3 = hippo instanceof Elephant; // false
		
		boolean b6 = hippo instanceof Mother;
		System.out.println("b6 =" +b6);
		Hippo anotherHippo = new Hippo();
		//boolean b5 = anotherHippo instanceof Elephant; 
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		somme(10, 2); // int, int
		
		byte x = 1;
		byte y = 2;
		int s = x*y;
		
		// cas de type primitif
		
		final int k = 10;
		//k = 11;
		
		final Animal a = new Animal(1,"toto");
		System.out.println(a);
		a.age = 10;
		System.out.println(a.age);
		//a = new Animal(2,"ab");
	}

}
