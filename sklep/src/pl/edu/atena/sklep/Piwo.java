package pl.edu.atena.sklep;

import java.math.BigDecimal;

public class Piwo extends BaseTowar {

	public Piwo() {
		super(RodzajTowaru.PIWO);
	}

	public Piwo(BigDecimal cena) {
		super(RodzajTowaru.PIWO);
		setCena(cena);
	}

}
