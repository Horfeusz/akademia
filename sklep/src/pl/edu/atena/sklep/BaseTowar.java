package pl.edu.atena.sklep;

import java.math.BigDecimal;

public abstract class BaseTowar implements Towar {

	private BigDecimal cena;

	private RodzajTowaru rodzajTowaru;

	public BaseTowar(RodzajTowaru rodzajTowaru) {
		this.cena = BigDecimal.ZERO;
		this.rodzajTowaru = rodzajTowaru;
	}

	public BigDecimal getCena() {
		return cena;
	}

	public void setCena(BigDecimal cena) {
		this.cena = cena;
	}

	public RodzajTowaru getRodzajTowaru() {
		return rodzajTowaru;
	}

	public void setRodzajTowaru(RodzajTowaru rodzajTowaru) {
		this.rodzajTowaru = rodzajTowaru;
	}

	public BigDecimal cena() {
		return getCena();
	}

	public RodzajTowaru rodzaj() {
		return getRodzajTowaru();
	}

	@Override
	public String toString() {
		return getRodzajTowaru().name();
	}
}
