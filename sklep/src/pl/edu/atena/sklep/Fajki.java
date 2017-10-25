package pl.edu.atena.sklep;

import java.math.BigDecimal;

public class Fajki extends BaseTowar {

	public Fajki(BigDecimal cena) {
		super(RodzajTowaru.FAJKI);
		setCena(cena);
	}

	@Override
	public RodzajTowaru rodzaj() {
		return RodzajTowaru.FAJKI;
	}

}
