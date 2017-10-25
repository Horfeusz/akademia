package pl.edu.atena.sklep;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Sklep Żabka
 * 
 * @author michalh
 *
 */
public class Zabka extends Sklep {

	/**
	 * Konstruktor
	 */
	public Zabka() {
		super("ŻABKA");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see pl.edu.atena.sklep.Sklep#promocja(pl.edu.atena.sklep.Towar)
	 */
	@Override
	protected Towar promocja(Towar towar) {
		switch (towar.rodzaj()) {
		case PIWO:
			BigDecimal cena = towar.cena().multiply(BigDecimal.valueOf(0.93)).setScale(2, RoundingMode.HALF_UP);
			return new Piwo(cena);
		default:
			return towar;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see pl.edu.atena.sklep.Sklep#cenaBazowa(pl.edu.atena.sklep.RodzajTowaru)
	 */
	@Override
	protected BigDecimal cenaBazowa(RodzajTowaru rodzajTowaru) {
		// FIXME - zaimplementować
		return null;
	}

}
