package day10_05012025.chapter5.Locale_Example;

import java.util.*;

public class ZooOpen {
	public static void main(String[] args) {
		
		Locale us = new Locale("en", "US");
		//Locale france = new Locale("fr", "FR");
		//printProperties(us);
		printPropertiesClass(us);
		System.out.println();
		//printProperties(france);
		//printPropertiesClass(france);
		
		/*
		Locale us = new Locale("en", "US");
		ResourceBundle rb = ResourceBundle.getBundle("Zoo", us);
		Set<String> keys = rb.keySet();
		keys.stream().map(k -> k + " " + rb.getString(k)).forEach(System.out::println);
		*/
		/*
		Locale us = new Locale("en", "US");
		ResourceBundle rb = ResourceBundle.getBundle("Zoo", us);
		Properties props = new Properties();
		rb.keySet().stream().forEach(k -> props.put(k, rb.getString(k)));
		System.out.println(props);*/
	}

	public static void printProperties(Locale locale) {
		ResourceBundle rb = ResourceBundle.getBundle("Zoo", locale);
		System.out.println(rb.getString("hello"));
		System.out.println(rb.getString("open"));
		
		Properties props = new Properties();
		rb.keySet().stream().forEach(k -> props.put(k, rb.getString(k)));
		System.out.println(props.getProperty("notReallyAProperty"));
		System.out.println(props.getProperty("notReallyAProperty", "123"));
		System.out.println(props.getProperty("hello"));
		System.out.println(props.getProperty("hello", "123"));
	}
	
	public static void printPropertiesClass(Locale locale) {
		ResourceBundle rb = ResourceBundle.getBundle("day10_05012025.chapter5.Locale_Example.Zoo", locale);
		System.out.println(rb.getString("hello"));
		System.out.println(rb.getString("open"));
	}
}