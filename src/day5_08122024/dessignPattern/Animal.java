package day5_08122024.dessignPattern;

import java.util.ArrayList;
import java.util.List;

public final class Animal {
	
	private final String nom;
	private final int age;
	private final List<String>foods;
	public Animal(String nom, int age, List<String> foods) {
		super();
		this.nom = nom;
		this.age = age;
		this.foods = new ArrayList(foods);
	}
	public String getNom() {
		return nom;
	}
	public int getAge() {
		return age;
	}
	public List<String> getFoods() {
		return new ArrayList(foods);
	}
	

}
