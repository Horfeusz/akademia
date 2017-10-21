package pl.atena.edu.akdaemia3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Obiektowosc {

	public static void main(String[] argc) {
		List<Pojazd> pojazdy = new ArrayList<>();
		pojazdy.add(new Rower("BMX"));
		pojazdy.forEach(i -> System.out.println(String.format("%s %d", i.nazwa(), i.iloscKol())));

		System.out.println();

		List<Obiekt> obiekty = new ArrayList<>();
		obiekty.add(new OsobaFizyczna("Staszek", "Trąbalski"));
		obiekty.add(new OsobaPrawna("Atena S.A."));
		obiekty.add(new Samolot("F15"));

		Kolej pkp = new Kolej();
		pkp.setModel("Pendolino");
		obiekty.add(pkp);

		obiekty.add(new Pojazd() {

			public String nazwa() {
				return "Statek kosmiczny";
			}

			@Override
			public int iloscKol() {
				return 0; // Bo nie ma kół ;-)
			}

		});

		obiekty.addAll(pojazdy);

		obiekty.sort(new Comparator<Obiekt>() {
			@Override
			public int compare(Obiekt o1, Obiekt o2) {
				return o1.nazwa().length() - o2.nazwa().length();
			}

		});

		obiekty.forEach(i -> System.out.println(i.nazwa()));

		System.out.println();

		for (Obiekt obiekt : obiekty) {
			if (obiekt instanceof Samochod) {
				System.out.println(obiekt.nazwa() + ": " + ((Samochod) obiekt).toCsv());
			}
		}

		obiekty.forEach(i -> {
			if (i instanceof Samochod) {
				System.out.println(i.nazwa() + ": " + ((Samochod) i).toCsv());
			}
		});

		System.out.println();

		System.out.println(Csv.toCsv("Test1", "Test2", "Test3", "Test4"));

	}

}
