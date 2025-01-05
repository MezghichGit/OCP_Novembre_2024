package day10_05012025;

public class UseEtudiant {

	public static void main(String[] args)  {
		Etudiant e = new Etudiant();
		try {
		e.setAge(-2);
		}
		catch (Exception ex) {
			// TODO: handle exception
		}
		System.out.println(e.getAge());
	}
}
