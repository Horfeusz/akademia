package pl.atena.edu.akdaemia2;

import java.util.Random;

import pl.atena.edu.akdaemia1.Osoba;

public class ScannerTest {

	public static void main(String[] argc) {

		Osoba osoba1 = new Osoba();
		Osoba osoba2 = new Osoba(23);
		Osoba osoba3 = new Osoba(23, 180);
		Osoba osoba4 = new Osoba("Micha�", "Hoffmann", 40, 180);
		final Osoba osoba5 = Osoba.instance("Zdzisiu");

		
		System.out.println(osoba2);
		System.out.println(osoba3);
		System.out.println(osoba4);
		
		osoba3.dodajLat(5);
		System.out.println(osoba3 + " pe�noletnia: " + (osoba3.pelnoletni() ? "Tak": "Nie"));
		
		
		
		
		
	}

}
