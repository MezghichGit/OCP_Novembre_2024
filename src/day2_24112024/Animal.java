package day2_24112024;

import java.io.IOException;

public class Animal {
	int age;
	String nom;
	public Animal(int age, String nom) {
		super();
		this.age = age;
		this.nom = nom;
	}
	public Animal() {
		
	}

	Animal info() throws Exception {  // visibilité package-private
		System.out.println("Animal");
		return new Animal();
	}
	
	
	public Number display() {
		return 10;
	}

}
