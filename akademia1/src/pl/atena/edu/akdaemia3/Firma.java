package pl.atena.edu.akdaemia3;

public class Firma {

	public Firma(String...nazwy) {
		System.out.println("nazwy");
	}
	
	public Firma(String nazwa) {
		System.out.println("NAZWA");
	}
	
	public static final Osoba PREZES = new Osoba();

	static {
		PREZES.setImie("Tomasz");
		PREZES.setNazwisko("PSZCZOŁa");
	}

	private String nazwa;
	
	
	
}
