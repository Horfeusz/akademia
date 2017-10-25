package pl.edu.atena.sklep;

import java.math.BigDecimal;

public class Maslo extends BaseTowar {

	public Maslo(BigDecimal cena) {
		super(RodzajTowaru.MASLO);
		setCena(cena);
	}

	@Override
	public RodzajTowaru rodzaj() {
		return RodzajTowaru.MASLO;
	}

}
