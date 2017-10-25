package pl.edu.atena.sklep;

import java.math.BigDecimal;

/**
 * Interfejs reprezentujący towar
 * 
 * @author michalh
 *
 */
public interface Towar {

	/**
	 * Metoda zwraca rodzaj towaru
	 */
	RodzajTowaru rodzaj();

	/**
	 * Zwraca cene
	 * 
	 * @return
	 */
	BigDecimal cena();
}
