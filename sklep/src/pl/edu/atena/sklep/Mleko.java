package pl.edu.atena.sklep;

import java.math.BigDecimal;

public class Mleko extends BaseTowar {

	public Mleko() {
		super(RodzajTowaru.MLEKO);
	}

	public Mleko(BigDecimal cena) {
		super(RodzajTowaru.MLEKO);
		setCena(cena);
	}

}
