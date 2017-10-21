package pl.atena.edu.akdaemia3;

public class Samochod extends BaseObiekt implements Obiekt, Csv {

	private String marka;

	public Samochod(String model, String marka) {
		super(model);
		this.marka = marka;
	}

	@Override
	public String nazwa() {
		return Csv.super.nazwa();
		//return String.format("%s %s", getModel(), marka);
	}

	//@Override
	public int iloscKol() {
		return 4;
	}

	@Override
	public String toCsv() {
		return String.format("%s%s%s", getModel(), SEPARATOR, marka);
	}

	@Override
	public void zuzywajPaliwo(int ilosc) {
		super.zuzywajPaliwo(ilosc);
	}
	
	

}
