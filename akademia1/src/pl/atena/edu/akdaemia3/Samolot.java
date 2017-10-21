package pl.atena.edu.akdaemia3;

import pl.atena.edu.akdaemia3.Obiekt;

/**
 * Klasa reprezentująca obiekty typu samolot
 *
 */
public class Samolot extends BaseObiekt implements Obiekt {

	private int nosnosc;

	public Samolot(String model) {
		super(model);
	}

	public int getNosnosc() {
		return nosnosc;
	}

	public void setNosnosc(int nosnosc) {
		this.nosnosc = nosnosc;
	}

	public void poruszajSie() {
		zuzywajPaliwo(10);
	}

	@Override
	public String toString() {
		return "Samolot [nosnosc=" + nosnosc + ", getNosnosc()=" + getNosnosc() + ", getPaliwo()=" + getPaliwo() + "]";
	}

	@Override
	protected void zuzywajPaliwo(int ilosc) {
		if (getPaliwo() < 10) {
			System.out.print("Jade na oparach");
		}
		setPaliwo(getPaliwo() - (ilosc - 1)); // Kradne po literku
	}

}
