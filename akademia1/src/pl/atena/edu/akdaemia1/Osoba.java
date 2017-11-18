package pl.atena.edu.akdaemia1;

import pl.atena.edu.adnotacje.Log;
import pl.atena.edu.adnotacje.LogSource;

@Log(messages = "Loguje sobie: ", type = LogSource.CONSOLA)
public class Osoba {

	public static final int PELNOLETNOSC = 18;

	private String imie;

	private String nazwisko;

	private Integer wiek;

	private Integer wzrost;

	public Osoba() {
		wiek = Integer.valueOf(0);
		wzrost = Integer.valueOf(0);
	}

	public Osoba(Integer wiek) {
		this();
		this.wiek = wiek;
	}

	public Osoba(String imie) {
		this();
		this.imie = imie;
	}

	public Osoba(int wiek, int wzrost) {
		this(wiek);
		this.wzrost = wzrost;
	}

	public Osoba(String imie, String nazwisko) {
		this.imie = imie;
		this.nazwisko = nazwisko;
	}

	public Osoba(String imie, String nazwisko, int wiek, int wzrost) {
		this(wiek, wzrost);
		this.imie = imie;
		this.nazwisko = nazwisko;
	}

	public static Osoba instance(String imie) {
		return new Osoba(imie);
	}

	public boolean pelnoletni() {
		return wiek < PELNOLETNOSC ? false : true;
	}

	public void dodajLat(int lata) {
		this.wiek += lata;
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

	public int getWzrost() {
		return wzrost;
	}

	public void setWzrost(int wzrost) {
		this.wzrost = wzrost;
	}

	@Override
	public String toString() {
		return String.format("Osoba [imie=%s, nazwisko=%s, wiek=%s, wzrost=%s]", imie, nazwisko, wiek, wzrost);
	}

}
