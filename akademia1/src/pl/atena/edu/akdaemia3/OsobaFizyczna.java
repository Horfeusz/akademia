package pl.atena.edu.akdaemia3;

/**
 * Obiekt <code>Osoba</code> opisuje dane osoby fizycznej
 * 
 * @author Michał Hoffmann
 * @version 1.1
 * 
 */
public class OsobaFizyczna implements Obiekt {

	private String imie;

	private String nazwisko;

	public OsobaFizyczna(String imie, String nazwisko) {
		this.imie = imie;
		this.nazwisko = nazwisko;
	}

	@Override
	public String nazwa() {
		return String.format("%s %s", imie, nazwisko);
	}

}
