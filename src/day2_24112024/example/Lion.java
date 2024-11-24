package day2_24112024.example;

class Lion extends Animal {
	String name = "Leo";

	public void printName() { // overriden method
		System.out.println(super.name);
		System.out.println(this.name);
		System.out.println(name);
	}
}
