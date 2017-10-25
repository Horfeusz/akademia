package pl.edu.atena.sklep;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Sklep {

	private String nazwa;

	List<PozycjaMagazyn> magazyn = new ArrayList<>();

	public Sklep(String nazwa) {
		this.nazwa = nazwa;
	}

	/**
	 * Metoda wyszukuje piwo w magazynie
	 * 
	 * @return
	 */
	private PozycjaMagazyn szukajWMagazynie(RodzajTowaru rodzajTowaru) {
		for (PozycjaMagazyn pozycjaMagazyn : magazyn) {
			if (pozycjaMagazyn.getTowar().rodzaj().equals(rodzajTowaru)) {
				return pozycjaMagazyn;
			}
		}
		return null;
	}

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
				//towar = new Piwo(BigDecimal.valueOf(3.67));
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
	 * @param towary
	 */
	public void dostawa(List<Towar> towary) {
		Objects.nonNull(towary);
		towary.forEach(t -> dodaj(t.rodzaj()));
	}

	public void sprzedaz(RodzajTowaru rodzajTowaru, int ilosc) {
		PozycjaMagazyn pozycja = szukajWMagazynie(rodzajTowaru);
		if (Objects.isNull(pozycja)) {
			return;
		}
		if (pozycja.getIlosc() < ilosc) {
			System.out.println("Nie mam tyle " + pozycja.getTowar() + " na sklepie");
			return;
		}

		// Uruchamiam promocje
		Towar towar = promocja(pozycja.getTowar());

		System.out.println(nazwa + " - Cena " + towar + " przed promocją: " + pozycja.getTowar().cena());
		System.out.println(nazwa + " - Cena " + towar + " po promocji: " + towar.cena());
	}

	/**
	 * Metoda będzie obninżac cene towaru
	 * 
	 * @param towar
	 * @return
	 */
	protected abstract Towar promocja(Towar towar);

}
