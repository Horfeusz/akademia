package pl.edu.atena.sklep;

import java.util.ArrayList;
import java.util.List;

/**
 * Proste testowanie sklepu
 * 
 * @author michalh
 *
 */
public class SklepTest {

	public static void main(String[] argc) {

		List<Towar> towary = new ArrayList<>();
		towary.add(new Piwo());
		towary.add(new Piwo());
		towary.add(new Piwo());
		towary.add(new Piwo());
		towary.add(new Piwo());
		towary.add(new Pomarancza());
		towary.add(new Pomarancza());
		towary.add(new Pomarancza());
		towary.add(new Pomarancza());
		towary.add(new Mleko());

		Sklep zabka = new Zabka();
		Sklep biedronka = new Biedronka();

		zabka.dostawa(towary);
		biedronka.dostawa(towary);

		zabka.sprzedaz(Osoba.instance(15), RodzajTowaru.PIWO, 1);
		biedronka.sprzedaz(Osoba.instance(19), RodzajTowaru.PIWO, 1);
		System.out.println();

		zabka.sprzedaz(Osoba.instance(19), RodzajTowaru.POMARANCZA, 1);
		biedronka.sprzedaz(Osoba.instance(19), RodzajTowaru.POMARANCZA, 1);
		System.out.println();

		zabka.sprzedaz(Osoba.instance(19), RodzajTowaru.MLEKO, 1);
		biedronka.sprzedaz(Osoba.instance(19), RodzajTowaru.MLEKO, 1);

	}

}
