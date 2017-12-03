package pl.atena.edu.strumienie;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class KolekcjeWynikow {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Przyklad1 p = new Przyklad1();

		// Tablica:
		String[] tab = p.getS().toArray(String[]::new);

		// Lista
		List<String> list = p.getS().collect(Collectors.toList());

		// Zestaw
		Set<String> set = p.getS().collect(Collectors.toSet());

		// Zestaw o konkretnej implementacji
		Set<String> wynik = p.getS().collect(Collectors.toCollection(TreeSet::new));

		
		String join = p.getS().collect(Collectors.joining());
		System.out.println(join);

		
		String join2 = p.getS().collect(Collectors.joining(";"));
		System.out.println(join2);

		
		IntSummaryStatistics summary = p.getS().collect(Collectors.summarizingInt(String::length));		
		System.out.println(summary.getMin());
		System.out.println(summary.getMax());
		System.out.println(summary.getAverage());

	}

}
