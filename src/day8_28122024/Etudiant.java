package day8_28122024;

public class Etudiant {
	
	private int id;
	private String nom;
	private int age;
	private double moyenne;
	
	public Etudiant(int id, String nom, int age, double moyenne) {
		super();
		this.id = id;
		this.nom = nom;
		this.age = age;
		this.moyenne = moyenne;
	}

	@Override
	public String toString() {
		return "Etudiant [id=" + id + ", nom=" + nom + ", age=" + age + ", moyenne=" + moyenne + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getMoyenne() {
		return moyenne;
	}

	public void setMoyenne(double moyenne) {
		this.moyenne = moyenne;
	}
}
