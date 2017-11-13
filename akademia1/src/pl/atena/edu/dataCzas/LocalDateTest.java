package pl.atena.edu.dataCzas;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateTest {

	public static void main(String[] args) {

		System.out.println(LocalDate.MIN);
		System.out.println(LocalDate.MAX);

		LocalDate teraz = LocalDate.now();
		
		System.out.println(teraz);

		LocalDate urodzony = LocalDate.of(1977, Month.AUGUST, 13);
		
		System.out.println(urodzony);

	}

}
