package pl.atena.edu.strumienie;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class Redukcje {

	/**
	 * Metoda wyświetlająca elementy strumienia
	 */
	public static void wyswietl(Stream<?> stream) {
		stream.limit(1000).forEach(System.out::println);
		System.out.println();

	}

	public static void main(String[] args) {
		Przyklad1 p = new Przyklad1();

		// Pobieram największą z posortowanych rosnąco
		Optional<String> largest = p.getS().max(Comparator.comparing(String::length));
		System.out.println("Najdłuższe słowo: " + largest.orElse(""));

		// Pobieram najmniejszą z posortowanych rosnąco
		Optional<String> shortest = p.getS().min(Comparator.comparing(String::length));
		System.out.println("Najkrótsze słowo: " + shortest.orElse(""));

		// Pierwsza z pofiltrowanej kolekcji
		Optional<String> first = p.getS().filter(item -> item.toLowerCase().startsWith("z")).findFirst();
		System.out.println("Pierwsze zaczynające się na j: " + first.orElse(""));

		Optional<Integer> first1 = Stream.of(24, 6, 8, 2, 4, 6, 88).sorted().findFirst();
		System.out.println("Pierwsza liczba: " + first1.orElse(0));

		// dowolny z pofitrowanej kolekcji
		Optional<String> any = p.getS().filter(item -> item.toLowerCase().startsWith("z")).findAny();
		System.out.println("Pierwsze zaczynające się na t: " + any.orElse(""));

		// dowolny z pofitrowanej kolekcji
		Optional<Integer> any1 = Stream.of(24, 6, 8, 2, 4, 6, 88).filter(item -> item < 10).findAny();
		System.out.println("Dowolna liczba: " + any1.orElse(0));

		// Sprawdzam czy istnieje taki element
		boolean isJava = p.getS().parallel().anyMatch(item -> item.equalsIgnoreCase("java"));
		System.out.println("Czy jest słowo: Java: " + isJava);

	}

}
