package day1_17112024;

public class Animal {
	
	// Les attributs d'instance
	String nom ="Animal";
	String espece;
	int age;
	
	// Les attributs de classe
	
	static double poidsMax;
	
	public Animal() {
		//int x;
		System.out.println("Animal");
	}
	
	public Animal(String nom) {
		this();
		// appel au constructeur par défaut de la même classe
		System.out.println("Animal avec parametre");
		
	}

}
