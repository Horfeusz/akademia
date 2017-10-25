package pl.edu.atena.sklep;

import java.math.BigDecimal;

public class PozycjaMagazyn {

	private Towar towar;

	private int ilosc;
	
	public PozycjaMagazyn(Towar towar, int ilosc) {
		super();
		this.towar = towar;
		this.ilosc = ilosc;
	}

	public Towar getTowar() {
		return towar;
	}

	public void setTowar(Towar towar) {
		this.towar = towar;
	}

	public int getIlosc() {
		return ilosc;
	}

	public void setIlosc(int ilosc) {
		this.ilosc = ilosc;
	}

	public void dodajilosc(int ilosc) {
		this.ilosc += ilosc;
	}

	public void zdejmijilosc(int ilosc) {
		this.ilosc -= ilosc;
	}

}
