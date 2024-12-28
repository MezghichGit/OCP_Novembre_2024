package day8_28122024;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ExoStream {

	public static void main(String[] args) {
		Etudiant e1 = new Etudiant(1,"Amine",24,16.5);
		Etudiant e2 = new Etudiant(2,"Majd",38,14.5);
		Etudiant e3 = new Etudiant(3,"Mohamed",25,12.5);
		Etudiant e4 = new Etudiant(4,"Ines",30,15.5);
		List<Etudiant> etudiants = new ArrayList<>();
		etudiants.add(e1);
		etudiants.add(e2);
		etudiants.add(e3);
		etudiants.add(e4);
		//System.out.println(etudiants);
		
		//Q1)
		//etudiants.stream().forEach(System.out::println);
		//Q2)
		
		//long nb = etudiants.stream().filter(e->e.getAge()>28).peek(System.out::println).count();
		//System.out.println(nb);
		//Q3
		//long nb = etudiants.stream().filter(e->e.getMoyenne()>15).peek(System.out::println).count();
		//System.out.println(nb);
		
	}

}
