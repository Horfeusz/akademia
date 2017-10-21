package pl.atena.edu.akdaemia6;

import java.math.BigDecimal;

import pl.atena.edu.akdaemia1.MarkaSamochodu;

public class Samochod {

	private MarkaSamochodu marka;

	private BigDecimal cena;

	public Samochod(MarkaSamochodu marka, BigDecimal cena) {
		super();
		this.marka = marka;
		this.cena = cena;
	}

	public MarkaSamochodu getMarka() {
		return marka;
	}

	public void setMarka(MarkaSamochodu marka) {
		this.marka = marka;
	}

	public BigDecimal getCena() {
		return cena;
	}

	public void setCena(BigDecimal cena) {
		this.cena = cena;
	}

	@Override
	public String toString() {
		return String.format("Samochod [marka=%s, cena=%s]", marka, cena);
	}

}
