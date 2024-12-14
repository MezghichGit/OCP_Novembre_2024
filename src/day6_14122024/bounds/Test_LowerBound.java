package day6_14122024.bounds;

import java.util.ArrayList;
import java.util.List;

public class Test_LowerBound {

	/*
	public static void addSound(List<?> list) {  //unbouned generics are immutable
		System.out.println(list);
		//list.add("quak");
		//list.add(true);
	}
	*/
	/*
	public static void addSound(List<? extends Object> list) {  //upper-bouned generics are immutable
		System.out.println(list);
		list.add("quak");
		//list.add(true);
	}
*/
	public static void addSound(List<? super String> list) {  //lower-bouned generics are mmutable
		System.out.println(list);
		list.add("quak");
		//list.add(true);
	}
	
	/*public static void addAnimal(List<? extends Animal> list) {  //unbouned generics are immutable
		System.out.println(list);
		list.add(new Oiseau());
	}*/
	
	public static void addAnimal(List<? super Oiseau> list) {  //unbouned generics are immutable
		System.out.println(list);
		list.add(new Oiseau());
	}
	public static void main(String[] args) {
		
		List<Animal>la = new ArrayList<Animal>();
		addAnimal(la);
		List<Oiseau>lo = new ArrayList<Oiseau>();
		addAnimal(lo);
		List<Canari>lc = new ArrayList<Canari>();
		addAnimal(lc);
		/*
		List<String> ls = new ArrayList<>();
		List<Object> lo = new ArrayList<>();
		lo.add(12);
		lo.add(10);
		addSound(ls);
		addSound(lo);*/
	}

}
