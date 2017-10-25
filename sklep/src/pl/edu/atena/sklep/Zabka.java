package pl.edu.atena.sklep;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Zabka extends Sklep {

	public Zabka() {
		super("ŻABKA");
	}

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

	@Override
	protected BigDecimal cenaBazowa(RodzajTowaru rodzajTowaru) {
		// TODO Auto-generated method stub
		return null;
	}

}
