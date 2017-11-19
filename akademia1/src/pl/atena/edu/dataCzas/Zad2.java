package pl.atena.edu.dataCzas;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Zad2 {

	public static int ilePechow(int rok) {
		int ile = 0;
		LocalDate ld = LocalDate.of(rok, 1, 1);
		do {
			// Wyznaczam następny piątek
			ld = ld.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
			if (ld.getDayOfMonth() == 13) {
				ile++;
			}
		} while (ld.getYear() < rok + 100);
		return ile;
	}

	public static void main(String[] args) {
		for (int i = 1901; i < 2001; i += 100) {
			System.out.println("W stuleciu " + i + " piątków trzynastego było: " + ilePechow(i));
		}

	}

}
