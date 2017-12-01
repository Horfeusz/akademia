package pl.atena.edu.strumienie;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.Stream;

public class Przyklad2 {

	/**
	 * Metoda wyświetlająca elementy strumienia
	 */
	public static void wyswietl(Stream<?> stream) {
		stream.limit(50).forEach(System.out::println);
		System.out.println();
	}

	/**
	 * Tworzenie strumienia z tablicy
	 */
	public static void zTablicy(Przyklad1 p) {

		String[] slowa = (String[]) p.getL().toArray();
		Stream<String> stream = Stream.of(slowa);
		// wyswietl(stream);
		wyswietl(stream.filter(item -> item.length() > 12));

		Stream<Integer> si = Stream.of(2, 5, 7, 4, 2, 88, 9, 33);
		wyswietl(si);

		Integer[] tab = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		Stream<Integer> si2 = Arrays.stream(tab, 3, 6);
		wyswietl(si2);
	}

	/**
	 * Tworzenie nieskończonych strumieni
	 */
	public static void nieskonczony() {
		Stream<String> pusty = Stream.empty();
		wyswietl(pusty);

		// UWAGA (bez limit) !!! trzeba ubić :-)
		Stream<String> echo = Stream.generate(() -> "Echo");
		wyswietl(echo);

		// UWAGA (bez limit) !!! trzeba ubić :-)
		Stream<Double> losowe = Stream.generate(Math::random);
		wyswietl(losowe);

		// UWAGA (bez limit) !!! trzeba ubić :-)
		Stream<BigInteger> integers = Stream.iterate(BigInteger.ZERO, n -> n.add(BigInteger.ONE));
		wyswietl(integers);

	}

	public static void main(String[] args) {
		Przyklad1 p = new Przyklad1();

		zTablicy(p);

		nieskonczony();

	}

}
