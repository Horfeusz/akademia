package pl.atena.edu.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaTest9 {

	public static Comparator<String> reverse(Comparator<String> comp) {
		return (x, y) -> comp.compare(x, y);
	}

	public static void main(String[] args) {
		List<String> lista = Arrays.asList("Krystian", "Anita", "Olaf", "Michał");

		lista.sort(reverse(String::compareToIgnoreCase));
		lista.forEach(System.out::println);

		System.out.println();

		lista.sort(reverse((x, y) -> -1 * x.compareTo(y)));
		lista.forEach(System.out::println);

	}

}
