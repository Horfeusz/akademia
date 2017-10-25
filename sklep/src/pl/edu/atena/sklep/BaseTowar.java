package pl.edu.atena.sklep;

import java.math.BigDecimal;

/**
 * Bazowa klasa dla towarow
 * 
 * @author michalh
 *
 */
public abstract class BaseTowar implements Towar {

	/** Cen towaru */
	private BigDecimal cena;

	/** Rodzaj towaru */
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
		if (getRodzajTowaru() != null) {
			return getRodzajTowaru().name();
		} else {
			return String.format("BaseTowar [cena=%s, rodzajTowaru=%s]", cena, rodzajTowaru);
		}
	}

}
