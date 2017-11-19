package pl.atena.edu.dataCzas;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Zad1 {

	public static void main(String[] args) {
		long ilosc = LocalDate.of(1977, 8, 13).until(LocalDate.now(), ChronoUnit.DAYS);
		System.out.println("Żyje: " + ilosc);
	}

}
