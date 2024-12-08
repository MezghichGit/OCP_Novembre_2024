package qcm1_05122024;

public interface Vehicule {
	
	// Version 8
	default public void info() {}
	static public void infoStatic() {}
	
	// Version 11
	private void info2() {}
	private static void infoStatic2() {}

}
