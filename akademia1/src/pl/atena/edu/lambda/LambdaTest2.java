package pl.atena.edu.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class LambdaTest2 {

	public static void main(String[] args) {

		String[] tab = { "Staszek", "Maksymilian", "Ola" };

		// Tak
		Arrays.sort(tab, (pierwszy, drugi) -> pierwszy.compareToIgnoreCase(drugi));
		// Albo tak
		Arrays.sort(tab, String::compareToIgnoreCase);

		List<String> lista = new ArrayList<>();
		lista.addAll(Arrays.asList(tab));

		// Tak
		lista.forEach(item -> System.out.println(item));
		// Albo tak
		lista.forEach(System.out::println);

		System.out.println();

		// Tak
		lista.removeIf(element -> Objects.nonNull(element));
		// Albo tak
		lista.removeIf(Objects::nonNull);

		lista.forEach(System.out::println);

	}

}
