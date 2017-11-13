package pl.atena.edu.dataCzas;

import java.time.LocalDate;

public class DzienProgramisty {

	public static void main(String[] args) {

		// Dzień programisty 256 dzień w roku
		int year = LocalDate.now().getYear();
		LocalDate dp = LocalDate.of(year, 1, 1).plusDays(256);
		System.out.println(dp);

	}

}
