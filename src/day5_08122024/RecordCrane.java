package day5_08122024;

public record RecordCrane(int numberEggs, String name) {
	
	// deux attributs d'instance numberEggs et name
	// deux méthodes numberEggs() et name()
	// toString(); equals();
	// constructeur avec deux paramèters
	
	public RecordCrane{
		if (numberEggs < 0) throw new IllegalArgumentException("Valeur négative");
		name = name.toUpperCase();
	}

}
