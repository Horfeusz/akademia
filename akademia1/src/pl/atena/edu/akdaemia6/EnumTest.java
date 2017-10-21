package pl.atena.edu.akdaemia6;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Set;

public class EnumTest {

	public static void main(String[] args) {
		Towar.JABLKO.gnije();
		Towar.OGOREK.gnije();
		Towar.KAPUSTA.gnije();

		// Zestaw z enuma
		Set<Towar> towary1 = EnumSet.allOf(Towar.class);
		towary1.forEach(System.out::println);

		// Pusty zestaw na podstawie klasy
		Set<Towar> towary2 = EnumSet.noneOf(Towar.class);
		towary2.forEach(System.out::println);

		// Zestaw o podanym zakresie
		Set<Towar> towary3 = EnumSet.range(Towar.OGOREK, Towar.MARCHEW);
		towary3.forEach(System.out::println);

		// Zestaw z podanych elementów
		Set<Towar> towary5 = EnumSet.of(Towar.JABLKO, Towar.KAPUSTA);
		towary5.forEach(System.out::println);

		// Tworzy mapę z kluczami na podstawie Enuma z pustymi wartościami
		EnumMap<Towar, String> eMap = new EnumMap<>(Towar.class);
		eMap.put(Towar.OGOREK, "Jakiś teks");
		System.out.println(eMap.get(Towar.OGOREK));

	}

}
