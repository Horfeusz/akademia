package pl.atena.edu.akdaemia3;

public class Osoba {

	private String imie;

	private String nazwisko;

	private int wiek;

	public class Buty {
		private String marka;

		public Buty(String marka) {
			this.marka = marka;
		}
	}

	public Buty dodajButy(String marka) {
		return new Buty(marka);
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public int getWiek() {
		return wiek;
	}

	public void setWiek(int wiek) {
		this.wiek = wiek;
	}

	@Override
	public String toString() {
		return String.format("Osoba [imie=%s, nazwisko=%s, wiek=%s]", imie, nazwisko, wiek);
	}

}
