package day10_05012025.chapter5.Locale_Example;

import java.util.Locale;
import java.util.ResourceBundle;

public class Ordre_Bundle {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("hi"));
		System.out.println(Locale.getDefault());
		ResourceBundle rb = ResourceBundle.getBundle("ZooAnimal", new Locale("en","US"));
		System.out.println(rb.getString("test"));

	}

}
