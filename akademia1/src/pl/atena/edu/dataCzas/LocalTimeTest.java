package pl.atena.edu.dataCzas;

import java.time.LocalTime;

public class LocalTimeTest {

	public static void main(String[] args) {

		LocalTime teraz = LocalTime.now();

		System.out.println(teraz);

		LocalTime czternastaPiec = LocalTime.of(14, 5);

		System.out.println(czternastaPiec);
		
	}
}
