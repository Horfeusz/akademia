package pl.edu.atena.sklep;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Biedronka extends Sklep {

	public Biedronka() {
		super("Biedronka");
	}

	private BigDecimal cena(Towar towar, double promocja) {
		return towar.cena().multiply(BigDecimal.valueOf(promocja)).setScale(2, RoundingMode.HALF_UP);
	}

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

	@Override
	protected BigDecimal cenaBazowa(RodzajTowaru rodzajTowaru) {
		// TODO Auto-generated method stub
		return null;
	}

}
