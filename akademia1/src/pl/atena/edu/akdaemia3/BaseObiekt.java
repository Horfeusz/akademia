package pl.atena.edu.akdaemia3;

public class BaseObiekt implements Obiekt {

	private String model;

	private int paliwo;

	public BaseObiekt() {
		super();
		paliwo = 100;
	}

	public BaseObiekt(String model) {
		this();
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String nazwa() {
		return model;
	}

	protected void zuzywajPaliwo(int ilosc) {
		paliwo -= ilosc;
	}

	public int getPaliwo() {
		return paliwo;
	}

	public void setPaliwo(int paliwo) {
		this.paliwo = paliwo;
	}

}
