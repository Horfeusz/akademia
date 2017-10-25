package pl.edu.atena.sklep;

import java.math.BigDecimal;

public class Pomarancza extends BaseTowar {

	public Pomarancza() {
		super(RodzajTowaru.POMARANCZA);
	}

	public Pomarancza(BigDecimal cena) {
		super(RodzajTowaru.POMARANCZA);
		setCena(cena);
	}

}
