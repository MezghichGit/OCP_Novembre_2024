package day5_08122024.dessignPattern;

import java.util.ArrayList;
import java.util.List;

public class TestImmutable {

	public static void main(String[] args) {
		List<String>repas = new ArrayList<>();
		repas.add("A");
		repas.add("B");
		repas.add("C");
		Animal a = new Animal("X",2,repas);
		System.out.println(a.getFoods());
		repas.clear();
		//a.getFoods().clear();
		System.out.println(a.getFoods());

	}

}
