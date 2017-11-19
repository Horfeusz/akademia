package pl.edu.atena.sklep;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

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
		Objects.requireNonNull(towar.cena(), "Brak ceny na towarze");
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
		BigDecimal cena = null;
		switch (rodzajTowaru) {
		case PIWO:
			cena = BigDecimal.valueOf(3.50);
			break;
		case POMARANCZA:
			cena = BigDecimal.valueOf(1.34);
			break;
		case FAJKI:
			cena = BigDecimal.valueOf(15.50);
			break;
		case MASLO:
			cena = BigDecimal.valueOf(7.50);
			break;
		case MLEKO:
			cena = BigDecimal.valueOf(2.05);
			break;
		default:
			cena = BigDecimal.ZERO;
			break;
		}

		return modyfikator().apply(cena);
	}

}
