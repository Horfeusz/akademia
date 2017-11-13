package pl.atena.edu.dataCzas;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;

public class TemporalAdjustersTest2 {

	public static void main(String[] args) {

		TemporalAdjuster NASTĘPNY_DZIEŃ_PRACY = w -> {
			LocalDate result = (LocalDate) w;
			do {
				result = result.plusDays(1);
			} while (result.getDayOfWeek().getValue() >= 6);
			return result;
		};
		LocalDate backToWork = LocalDate.now().with(NASTĘPNY_DZIEŃ_PRACY);
		
		System.out.println(backToWork);
		

	}

}
