package pl.atena.edu.dataCzas;

import java.time.Duration;
import java.time.Instant;

public class DurationTest {

	public static void main(String[] args) throws InterruptedException {
		
		Instant start = Instant.now();
		
		Thread.sleep(1000);

		Instant koniec = Instant.now();
		
		Duration roznica = Duration.between(start, koniec);
		
		long milisekundy = roznica.toMillis();
		
		System.out.println(milisekundy);
		
	}

}
