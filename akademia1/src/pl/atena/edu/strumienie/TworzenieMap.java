package pl.atena.edu.strumienie;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

import pl.atena.edu.akdaemia3.Osoba;

public class TworzenieMap {

	public static void main(String[] args) {

		List<Osoba> studenci = new ArrayList<>();
		studenci.add(new Osoba(1, "Krystian", "Derkowski"));
		studenci.add(new Osoba(2, "Krystian", "Bławat"));
		studenci.add(new Osoba(3, "Robert", "Perlejewski"));

		Map<Integer, String> idNazwisko = studenci.stream().collect(Collectors.toMap(Osoba::getId, Osoba::getNazwisko));

		System.out.println(idNazwisko);

		Map<Integer, Osoba> mStudenci = studenci.stream().collect(Collectors.toMap(Osoba::getId, Function.identity()));

		System.out.println(mStudenci);

		// -------------------------------------------------------------------------------------------------------------

		studenci.add(new Osoba(3, "Ewa", "Ługin"));
		try {
			Map<Integer, Osoba> mStudenci2 = studenci.stream()
					.collect(Collectors.toMap(Osoba::getId, Function.identity()));
			System.out.println(mStudenci2);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		}

		Map<Integer, Osoba> mStudenci3 = studenci.stream()
				.collect(Collectors.toMap(Osoba::getId, Function.identity(), (a, b) -> b));

		System.out.println(mStudenci3);

		Map<Integer, Osoba> mStudenci4 = studenci.stream()
				.collect(Collectors.toMap(Osoba::getId, Function.identity(), (a, b) -> a, TreeMap::new));

		System.out.println(mStudenci4);

	}

}
