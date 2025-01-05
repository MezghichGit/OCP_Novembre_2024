package day9_29122024;

public class Test {

	public static void main(String[] args) throws Exception {
		
		try(DB db = new DB())
		{
			db.processing();
		}
		// finally implicit qui va exécuter la méthode close
		finally {
			System.out.println("Fin du programme");
		}

	}

}
