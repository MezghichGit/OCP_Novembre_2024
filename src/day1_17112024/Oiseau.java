package day1_17112024;

public class Oiseau extends Animal{
	String nom ="Oiseau";
	public Oiseau() {
		//super();  //appel au constructeur parent par défaut
		super("Chien"); // appel au constructeur avec paramètre
		System.out.println("Oiseau");
	}
	
	public void displayData()
	{
		System.out.println(this.nom+" "+super.nom);
	}
}
