package day10_05012025.chapter5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class LesDateTime {

	public static void main(String[] args) {
		// 1-Creation
		
		LocalDate ld = LocalDate.now();
		
		System.out.println(ld);
		
		// 2-Manipulating
		
		//System.out.println(ld.plusYears(2));
		ld = ld.plusYears(2);
		System.out.println(ld);
		
		// 3-Formatting
		DateTimeFormatter f = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		System.out.println(f.format(ld));
	}

}
