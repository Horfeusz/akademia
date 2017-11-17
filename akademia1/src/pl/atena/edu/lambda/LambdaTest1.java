package pl.atena.edu.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaTest1 {

	public static void main(String[] args) {

		String[] tab = { "Staszek", "Maksymilian", "Ola" };

		Arrays.sort(tab, (pierwszy, drugi) -> pierwszy.length() - drugi.length());

		List<String> lista = new ArrayList<>();
		lista.addAll(Arrays.asList(tab));

		lista.forEach(System.out::println);

		System.out.println();

		lista.removeIf(element -> element.equals("Ola"));

		lista.forEach(System.out::println);

	}

}
