package pl.atena.edu.dataCzas;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest {

	public static void main(String[] args) {

		// Pierwszy Wtorek miesiąca
		LocalDate pierwszyWtorek = LocalDate.of(2017, 11, 1).with(TemporalAdjusters.nextOrSame(DayOfWeek.TUESDAY));

		System.out.println(pierwszyWtorek);

		LocalDate pierwszyWtorek2 = LocalDate.of(2017, 11, 1).with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
		
		System.out.println(pierwszyWtorek2);
	}

}
