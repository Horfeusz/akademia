package pl.atena.edu.akdaemia1;

/**
 * Klasa reprezentuj¹ca obiekty sklepów
 * 
 * @author michalh
 *
 */
public class Sklep {

	/** Atrybut reprezentuj¹cy iloœæ piwa na sklepie */
	private Integer iloscPiwa = Integer.valueOf(0);

	/**
	 * Metoda sprzedaje domyœlnie jedn¹ butelke piwa danej osobie
	 * 
	 * @param osoba
	 */
	public void sprzedaj(final Osoba osoba) {
		checkOsoba(osoba);

		iloscPiwa--;
		// TODO
	}

	/**
	 * Metoda sprzedaje podan¹ iloœæ butelek piwa danej osobie
	 * 
	 * @deprecated Use <code>setVisible(true)</code> instead
	 * 
	 * @see Osoba
	 * @since version 1.7.1
	 * @param osoba
	 *            {@link Osoba}
	 * @param ilosc
	 */
	public void sprzedaj(Osoba osoba, int ilosc) {
		checkOsoba(osoba);

		// TODO
	}

	/**
	 * @param osoba
	 */
	private void checkOsoba(Osoba osoba) {
		if (osoba == null) {
			throw new NullPointerException("Argument osoba = null");
		}

		// TODO
	}

}
