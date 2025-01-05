package day10_05012025;

public class Etudiant {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age<19)
			throw new IllegalArgumentException("Age invalide");
		else
		this.age = age;
	}
}
