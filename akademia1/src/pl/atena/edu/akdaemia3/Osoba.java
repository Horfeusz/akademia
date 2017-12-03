package pl.atena.edu.akdaemia3;

public class Osoba {

	private Integer id;

	private String imie;

	private String nazwisko;

	private int wiek;

	public Osoba() {

	}

	public Osoba(Integer id, String imie, String nazwisko) {
		super();
		this.id = id;
		this.imie = imie;
		this.nazwisko = nazwisko;
	}

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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return String.format("Osoba [id=%s, imie=%s, nazwisko=%s, wiek=%s]", id, imie, nazwisko, wiek);
	}

}
