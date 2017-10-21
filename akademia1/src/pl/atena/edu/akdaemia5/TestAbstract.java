package pl.atena.edu.akdaemia5;

public class TestAbstract {

	public static void main(String[] argc) {

		WczytajPlikAssistance ass = new WczytajPlikAssistance();
		ass.wczytajPlik("d:\\ASSISTANCE_2013-10-10_1186.csv");

		System.out.println();

		WczytajPlikInaczej inaczej = new WczytajPlikInaczej();
		inaczej.wczytajPlik("d:\\ASSISTANCE_2013-10-10_1186.csv");

	}

}
