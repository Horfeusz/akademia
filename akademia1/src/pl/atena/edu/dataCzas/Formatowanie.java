package pl.atena.edu.dataCzas;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Formatowanie {

	public static void main(String[] args) {

		ZonedDateTime zdt = ZonedDateTime.now();

		DateTimeFormatter formatterDT = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
		DateTimeFormatter formatterD = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		String formattedDT = formatterDT.format(zdt);
		String formattedD = formatterD.format(zdt);

		System.out.println(formattedDT);
		System.out.println(formattedD);

		// Własny formater
		DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String myFormatted = myFormatter.format(zdt);
		System.out.println(myFormatted);
	}

}
