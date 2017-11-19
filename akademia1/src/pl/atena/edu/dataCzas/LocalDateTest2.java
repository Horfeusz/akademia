package pl.atena.edu.dataCzas;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;

public class LocalDateTest2 {

	public static void main(String[] args) {

		LocalDate teraz = LocalDate.now().minusYears(1);
		LocalDate ostatnieUrodziny = LocalDate.of(teraz.getYear(), Month.AUGUST, 13);

		// Komentarz wydaje się być niezrozumiały. Liczy tylko miesiące ???
		Period period = Period.between(ostatnieUrodziny, teraz);
		System.out.println(period.getDays());
		System.out.println(period.getMonths());
		System.out.println(period.getYears());
		System.out.println(period);

		// Lepsze wydae się metoda until
		long dni = ostatnieUrodziny.until(teraz, ChronoUnit.DAYS);
		System.out.println(dni);

		System.out.println();

		// Poprawne wyznaczanie miesiąca
		System.out.println(LocalDate.of(2016, 1, 31).plusMonths(1));

		System.out.println(LocalDate.of(2017, 1, 31).plusMonths(1));

		// Dzień w tygodniu
		System.out.println(LocalDate.of(2017, 1, 31).plusMonths(1).getDayOfWeek());

		System.out.println(DayOfWeek.MONDAY.plus(5));

		System.out.println(MonthDay.now());
		System.out.println(MonthDay.now().getDayOfMonth());
		System.out.println(MonthDay.now().getMonth());

		System.out.println(YearMonth.now());
		System.out.println(YearMonth.now().getMonth());
		System.out.println(YearMonth.now().getYear());

		System.out.println(Year.now());

	}

}
