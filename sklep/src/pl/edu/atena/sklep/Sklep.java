package pl.edu.atena.sklep;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.UnaryOperator;

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
				towar = new Piwo(cenaBazowa(rodzajTowaru));
				break;
			case FAJKI:
				towar = new Fajki(cenaBazowa(rodzajTowaru));
				break;
			case MLEKO:
				towar = new Mleko(cenaBazowa(rodzajTowaru));
				break;
			case POMARANCZA:
				towar = new Pomarancza(cenaBazowa(rodzajTowaru));
				break;
			case MASLO:
				towar = new Maslo(cenaBazowa(rodzajTowaru));
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

	private void sprawdzWiek(Osoba osoba, RodzajTowaru rodzajTowaru) {
		Objects.requireNonNull(osoba);
		Objects.requireNonNull(rodzajTowaru);

		try {
			Field field = rodzajTowaru.getClass().getField(rodzajTowaru.name());
			SprawdzWiek sw = field.getAnnotation(SprawdzWiek.class);
			if (sw == null) {
				return;
			}
			if (osoba.getWiek() < sw.wiek()) {
				throw new IllegalArgumentException("Koleżka ma mniej niż wymagane: " + sw.wiek());
			}
		} catch (SecurityException | NoSuchFieldException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Metoda odpowiedzialna za sprzedaż
	 * 
	 * @param rodzajTowaru
	 * @param ilosc
	 */
	public void sprzedaz(Osoba osoba, RodzajTowaru rodzajTowaru, int ilosc) {
		sprawdzWiek(osoba, rodzajTowaru);

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
	 * Metoda modyfikująca cene bazową
	 * 
	 * @param cenaBazowa
	 * @return
	 */
	protected UnaryOperator<BigDecimal> modyfikator() {
		int month = LocalDate.now().getMonthValue();
		if (month % 2 == 0) {
			return item -> {
				Objects.requireNonNull(item, "Nie podano ceny do zmodyfikowania");
				return item.multiply(BigDecimal.valueOf(0.9)).setScale(2, RoundingMode.HALF_UP);
			};
		} else {
			return item -> {
				Objects.requireNonNull(item, "Nie podano ceny do zmodyfikowania");
				BigDecimal nowaCena = item.multiply(BigDecimal.valueOf(1.05)).setScale(2, RoundingMode.HALF_UP);
				System.out.println("Modyfikator z:" + item + " na:" + nowaCena);
				return nowaCena;
			};
		}
	}

	/**
	 * Metoda będzie obninżac cene towaru
	 * 
	 * @param towar
	 * @return zwraca nową instancję towaru z zmodyfikowaną ceną
	 */
	protected abstract Towar promocja(Towar towar);

}
