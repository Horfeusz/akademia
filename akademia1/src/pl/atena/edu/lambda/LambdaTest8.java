package pl.atena.edu.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaTest8 {

	public static Comparator<String> compareInDirecton(int direction) {
		return (x, y) -> direction * x.compareTo(y);
	}

	public static void main(String[] args) {
		List<String> lista = Arrays.asList("Krystian", "Anita", "Olaf", "Michał");

		lista.sort(compareInDirecton(1));
		lista.forEach(System.out::println);

		System.out.println();

		lista.sort(compareInDirecton(-1));
		lista.forEach(System.out::println);

	}
}
