package day2_24112024.OverrideObjectMethods;

public class Lion {
	int idNumber;
	
	public Lion(int idNumber) {
		this.idNumber = idNumber;
	}
	
	public boolean equals(Lion obj) {
		System.out.println("equals of Lion");
		if (obj == null) return false;
		return this.idNumber == obj.idNumber;
		}

}
