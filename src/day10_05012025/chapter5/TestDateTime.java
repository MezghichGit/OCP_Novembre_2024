package day10_05012025.chapter5;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TestDateTime {

	public static void main(String[] args) {
		/*
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		System.out.println(ZonedDateTime.now());
		
		System.out.println(Month.JANUARY.ordinal());
		System.out.println(ZoneId.systemDefault());
		Period period = Period.of(0, 1, 0);
		System.out.println(period);
		LocalDate ld = LocalDate.now();
		ld = ld.plus(period);
		System.out.println(ld);
		LocalDate ld2 = LocalDate.of(2025, 1, 29);
		System.out.println(ld2.plus(period));*/
		Instant now = Instant.now();
		System.out.println(now);
		// do something time consuming
		Instant later = Instant.now();
		System.out.println(later);
		Duration duration = Duration.between(now, later);
		System.out.println(duration.toMillis()); 

	}

}
