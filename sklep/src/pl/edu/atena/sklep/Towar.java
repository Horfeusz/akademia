package pl.edu.atena.sklep;

import java.math.BigDecimal;

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
