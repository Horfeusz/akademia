package pl.atena.edu.akdaemia3;

public class Rower implements Pojazd {

	private String nazwa;

	public Rower(String nazwa) {
		this.nazwa = nazwa;
	}

	@Override
	public String nazwa() {
		return nazwa;
	}

	@Override
	public int iloscKol() {
		return 2;
	}

}
