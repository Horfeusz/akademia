package pl.edu.atena.sklep;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Skle Biedronka
 * 
 * @author michalh
 *
 */
public class Biedronka extends Sklep {

	public Biedronka() {
		super("Biedronka");
	}

	/**
	 * Metoda wyliczająca cene towaru po zastosowaniu współczynika promocji
	 * 
	 * @param towar
	 *            towar
	 * @param promocja
	 *            współczynik promocji
	 * @return cena po zastosowaniu współczynika
	 */
	private BigDecimal cena(Towar towar, double promocja) {
		return towar.cena().multiply(BigDecimal.valueOf(promocja)).setScale(2, RoundingMode.HALF_UP);
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
			return new Piwo(cena(towar, 0.96));
		case POMARANCZA:
			return new Pomarancza(cena(towar, 0.9));
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
		switch (rodzajTowaru) {
		case PIWO:
			return BigDecimal.valueOf(3.96);
		case POMARANCZA:
			return BigDecimal.valueOf(1.50);
		case FAJKI:
			return BigDecimal.valueOf(13.3);
		case MASLO:
			return BigDecimal.valueOf(6.50);
		case MLEKO:
			return BigDecimal.valueOf(1.75);
		default:
			return BigDecimal.ZERO;
		}
	}

}
