package pl.edu.atena.sklep;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Abstrakcyjna klasa do reprezenatcji konkretnego sklepu
 * 
 * @author michalh
 *
 */
public abstract class Sklep {

	/** Nazwa sklepu */
	private String nazwa;

	/** Magazyn */
	private List<PozycjaMagazyn> magazyn = new ArrayList<>();

	public Sklep(String nazwa) {
		this.nazwa = nazwa;
	}

	/**
	 * Metoda wyszukuje towar w magazynie
	 * 
	 * @param rodzajTowaru
	 *            rodzaj poszukiwanego towaru
	 * @return pozycja magazynu
	 */
	private PozycjaMagazyn szukajWMagazynie(RodzajTowaru rodzajTowaru) {
		for (PozycjaMagazyn pozycjaMagazyn : magazyn) {
			if (pozycjaMagazyn.getTowar().rodzaj().equals(rodzajTowaru)) {
				return pozycjaMagazyn;
			}
		}
		return null;
	}

	/**
	 * Metoda pobierająca cene bazową dla konkretnej instancji sklepu
	 * 
	 * @param rodzajTowaru
	 *            rodzajTowaru {@link RodzajTowaru}
	 * @return cena bazowa dla towaru
	 */
	protected abstract BigDecimal cenaBazowa(RodzajTowaru rodzajTowaru);

	/**
	 * Metoda dodaje piwo do magazynu
	 */
	private void dodaj(RodzajTowaru rodzajTowaru) {
		Objects.nonNull(rodzajTowaru);
		PozycjaMagazyn result = szukajWMagazynie(rodzajTowaru);
		if (result == null) {
			Towar towar = null;
			switch (rodzajTowaru) {
			case PIWO:
				// towar = new Piwo(BigDecimal.valueOf(3.67));
				towar = new Piwo(cenaBazowa(rodzajTowaru));
				break;
			case FAJKI:
				towar = new Fajki(BigDecimal.valueOf(14.50));
				break;
			case MLEKO:
				towar = new Mleko(BigDecimal.valueOf(2.50));
				break;
			case POMARANCZA:
				towar = new Pomarancza(BigDecimal.valueOf(5.50));
				break;
			case MASLO:
				towar = new Maslo(BigDecimal.valueOf(6.0));
				break;
			default:
				break;
			}
			if (towar != null) {
				magazyn.add(new PozycjaMagazyn(towar, 1));
			}
		} else {
			result.dodajilosc(1);
		}
	}

	/**
	 * Operacja dostawy towaru do sklepu
	 * 
	 * @param towary
	 *            lista towarów
	 */
	public void dostawa(List<Towar> towary) {
		Objects.nonNull(towary);
		towary.forEach(t -> dodaj(t.rodzaj()));
	}

	/**
	 * Metoda odpowiedzialna za sprzedaż
	 * 
	 * @param rodzajTowaru
	 * @param ilosc
	 */
	public void sprzedaz(RodzajTowaru rodzajTowaru, int ilosc) {
		PozycjaMagazyn pozycja = szukajWMagazynie(rodzajTowaru);
		if (Objects.isNull(pozycja)) {
			return;
		}
		if (pozycja.getIlosc() < ilosc) {
			System.out.println("Nie mam tyle " + pozycja.getTowar() + " na sklepie");
			return;
		}

		// FIXME - dokończyć ...

		// Uruchamiam promocje
		Towar towar = promocja(pozycja.getTowar());

		System.out.println(nazwa + " - Cena " + towar + " przed promocją: " + pozycja.getTowar().cena());
		System.out.println(nazwa + " - Cena " + towar + " po promocji: " + towar.cena());
	}

	/**
	 * Metoda będzie obninżac cene towaru
	 * 
	 * @param towar
	 * @return zwraca nową instancję towaru z zmodyfikowaną ceną
	 */
	protected abstract Towar promocja(Towar towar);

}
