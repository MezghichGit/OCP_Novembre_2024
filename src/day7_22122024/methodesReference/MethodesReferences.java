package day7_22122024.methodesReference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.Date;
public class MethodesReferences {

	public static void main(String[] args) {
		//1-Méthodes de référence : Cas de méthode de méthode static
		
		List<String> names = new ArrayList<>();
		names.add("mehdi");
		names.add("amine");
		names.add("salma");
		names.add("marwa");
		
		Consumer<List<String>> sorter = (List<String> l)->Collections.sort(l);
		System.out.println(names);
		//sorter.accept(names);
		//System.out.println(names);
		
		Consumer<List<String>> sorterRef =Collections::sort;
		sorterRef.accept(names);
		System.out.println(names);
		
		// 2-Méthodes de référence : Cas de méthode d'instance sur une instance fixe
		String phrase = "Certification OCP 17";
		
		//Implémentation de l'interface fonctionnelle Predicate par une expression lambda
		Predicate<String> pred = (String s)-> phrase.contains(s);
		
		System.out.println(pred.test("OCP"));
		System.out.println(pred.test("OCA"));
		
		//Implémentation de l'interface fonctionnelle Predicate par
		// une méthode de référence basé sur méthode d'instance(contains) sur une
		// instance fixe(phrase)
		Predicate<String> predRef = phrase::contains;
		
		
		System.out.println(predRef.test("OCP"));
		System.out.println(predRef.test("OCA"));
		
		// 3-Méthodes de référence : Cas de méthode d'instance sur une instance connue
		// au runtime
		Predicate<String> filter = (String s)->s.isEmpty();
		Predicate<String> filterRef = String::isEmpty;
		System.out.println(filterRef.test("OCP"));
		System.out.println(filterRef.test(""));
		
		// 4-Méthodes de référence : Cas du constructeur
		
		Supplier<Date> sd = ()->new Date();
		System.out.println(sd.get());
		
		Supplier<Date> sdRef =Date::new;
		System.out.println(sdRef.get());
		
	}

}
