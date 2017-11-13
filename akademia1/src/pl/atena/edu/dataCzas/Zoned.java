package pl.atena.edu.dataCzas;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Zoned {

	public static void main(String[] args) {

		// ZoneId.getAvailableZoneIds().forEach(System.out::println);

		// Nasz czas i czas w NY
		// Sprawdzamy: https://24timezones.com/zegar_czas.php#/map

		ZonedDateTime zdt = ZonedDateTime.now();
		Instant instant = zdt.toInstant();
		ZonedDateTime terazUsa = instant.atZone(ZoneId.of("America/New_York"));
		ZonedDateTime terazAus = instant.atZone(ZoneId.of("Australia/Sydney"));

		System.out.println("Nasz: " + zdt);
		System.out.println("Usa: " + terazUsa);
		System.out.println("Australia: " + terazAus);

	}

}
