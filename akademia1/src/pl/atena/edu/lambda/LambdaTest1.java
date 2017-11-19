package pl.atena.edu.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaTest1 {

	public static void main(String[] args) {

		String[] tab = { "Staszek", "Maksymilian", "Ola" };

		Comparator<String> comp = new Comparator<String>() {

			@Override
			public int compare(String pierwszy, String drugi) {
				return pierwszy.length() - drugi.length();
			}
		};

		Arrays.sort(tab, comp);
		
		
		Arrays.sort(tab, (pierwszy, drugi) -> pierwszy.length() - drugi.length());

		List<String> lista = new ArrayList<>();
		lista.addAll(Arrays.asList(tab));

		lista.forEach(System.out::println);

		System.out.println();

		lista.removeIf(element -> element.equals("Ola"));

		lista.forEach(System.out::printf);

	}

}
