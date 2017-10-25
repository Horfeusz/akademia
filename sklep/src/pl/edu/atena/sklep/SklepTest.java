package pl.edu.atena.sklep;

import java.util.ArrayList;
import java.util.List;

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

		zabka.sprzedaz(RodzajTowaru.PIWO, 1);
		biedronka.sprzedaz(RodzajTowaru.PIWO, 1);
		System.out.println();

		zabka.sprzedaz(RodzajTowaru.POMARANCZA, 1);
		biedronka.sprzedaz(RodzajTowaru.POMARANCZA, 1);
		System.out.println();

		zabka.sprzedaz(RodzajTowaru.MLEKO, 1);
		biedronka.sprzedaz(RodzajTowaru.MLEKO, 1);

	}

}
