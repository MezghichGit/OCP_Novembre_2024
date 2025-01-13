package day11_13012025;

import java.text.*;
import java.util.*;

public class FormatNumbers {
	public static void main(String[] args) throws ParseException {
		/*
		int attendeesPerYear = 3_200_000;
		int attendeesPerMonth = attendeesPerYear / 12;
		System.out.println(attendeesPerMonth);
		
		NumberFormat us = NumberFormat.getInstance(Locale.US);
		System.out.println(us.format(attendeesPerMonth));
		
		NumberFormat g = NumberFormat.getInstance(Locale.GERMANY);
		System.out.println(g.format(attendeesPerMonth));
		
		NumberFormat ca = NumberFormat.getInstance(Locale.CANADA_FRENCH);
		System.out.println(ca.format(attendeesPerMonth));
		*/
		
	
		//Locale.setDefault(new Locale("en","US"));
		//System.out.println(Locale.getDefault());
		/*
		double price = 48;
		NumberFormat us = NumberFormat.getCurrencyInstance();
		System.out.println(us.format(price));*/
		
		//Parsing example
		
		NumberFormat en = NumberFormat.getInstance(Locale.US);
		NumberFormat fr = NumberFormat.getInstance(Locale.FRANCE);
		String s = "40.45";
		System.out.println(en.parse(s)); // 40.45
		System.out.println(fr.parse(s)); // 40
		
	}
}