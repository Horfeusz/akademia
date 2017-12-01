package pl.atena.edu.strumienie;

import java.util.Comparator;
import java.util.stream.Stream;

public class Przeksztalcenia {

	/**
	 * Metoda wyświetlająca elementy strumienia
	 */
	public static void wyswietl(Stream<?> stream) {
		stream.limit(100).forEach(System.out::println);
		System.out.println();
	}

	public static void main(String[] args) {
		Przyklad1 p = new Przyklad1();

		// Strumień nieskończony
		// Pobieram wartości od 100 do 110
		Stream<Double> s1 = Stream.generate(Math::random).skip(100).limit(10);
		wyswietl(s1);

		// Łącze dwa strumienie
		Stream<String> s2 = Stream.concat(Stream.of("Witaj"), Stream.of("świecie"));
		wyswietl(s2);

		// Distinct
		Stream<Integer> s3 = Stream.of(1, 1, 2, 2, 3, 3, 4, 4, 5, 5).distinct();
		wyswietl(s3);

		// Strumień posortowany od najkrótszego słowa
		Stream<String> s4 = p.getL().stream().sorted(Comparator.comparing(String::length));
		wyswietl(s4);

		// Strumień posortowany od najkrótszego słowa o odwrócony
		Stream<String> s5 = p.getL().stream().sorted(Comparator.comparing(String::length).reversed());
		wyswietl(s5);

		// Dla każdej z wartości jest wołana jakaś metoda (daje to możliwość debugowania
		// strumienia)
		Stream<Integer> s6 = Stream.iterate(1, n -> n * (n + 1)).peek(value -> System.out.println("Wartość: " + value))
				.limit(6);
		wyswietl(s6);

	}

}
