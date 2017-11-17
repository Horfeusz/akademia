package pl.atena.edu.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import pl.atena.edu.akdaemia1.Osoba;

public class LambdaTest3 {

	public static void main(String[] args) {

		String[] tab = { "Staszek", "Maksymilian", "Ola" };
		List<String> lista = Arrays.asList(tab);

		Stream<Osoba> stream = lista.stream().map(Osoba::new);

		// Mogę go wyświetlić
		// stream.forEach(System.out::println);

		// Mogę go przerobić na tablicę
		Osoba[] tabO = stream.toArray(Osoba[]::new);

		Arrays.asList(tabO).forEach(System.out::println);

	}

}
