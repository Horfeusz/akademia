package pl.atena.edu.strumienie;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Przyklad3 {

	/**
	 * Metoda wyświetlająca elementy strumienia
	 */
	public static void wyswietl(Stream<?> stream) {
		stream.limit(10).forEach(System.out::println);
		System.out.println();
	}

	public static void filter(Przyklad1 p) {
		Stream<String> s = p.getL().stream().filter(item -> item.equalsIgnoreCase("java"));
		wyswietl(s);
	}

	public static Stream<String> litery(String s) {
		List<String> wynik = new ArrayList<>();
		for (int i = 0; i < s.length(); i++)
			wynik.add(s.substring(i, i + 1));
		return wynik.stream();
	}

	public static void map(Przyklad1 p) {
		Stream<String> s1 = p.getL().stream().map(String::toUpperCase);
		wyswietl(s1);

		Stream<String> s2 = p.getL().stream().map(item -> item.length() > 3 ? item.substring(0, 3) : item);
		wyswietl(s2);

		Stream<Stream<String>> s3 = p.getL().stream().map(w -> litery(w));
		wyswietl(s3);

		Stream<String> s4 = p.getL().stream().flatMap(w -> litery(w));
		wyswietl(s4);

	}

	public static void main(String[] args) {
		Przyklad1 p = new Przyklad1();

		filter(p);

		map(p);

	}

}
