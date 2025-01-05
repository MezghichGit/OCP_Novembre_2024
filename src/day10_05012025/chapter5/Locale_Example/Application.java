package day10_05012025.chapter5.Locale_Example;

import java.time.ZoneId;
import java.util.Locale;

public class Application {

	public static void main(String[] args) {
		/*
		System.out.println(ZoneId.systemDefault());
		Locale locale = Locale.getDefault();
		System.out.println(locale);
		System.out.println(Locale.GERMAN); // de
		System.out.println(Locale.GERMANY); // de_DE
		System.out.println(new Locale("hi", "IN")); // hi_IN
		*/
		Locale us = new Locale("en", "US");
		Locale france = new Locale("fr", "FR");
		Locale englishCanada = new Locale("en", "CA");
		Locale frenchCanada = new Locale("fr", "CA");

	}

}
