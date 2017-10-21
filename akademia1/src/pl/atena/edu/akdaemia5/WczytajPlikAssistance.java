package pl.atena.edu.akdaemia5;

import java.util.Arrays;

public class WczytajPlikAssistance extends AWczytajPlik {

	private static final String SEPARATOR = ", ";

	@Override
	protected void przetwarzajLinie(String wiersz) {
		String[] row = wiersz.split(";");
		StringBuilder sb = new StringBuilder();
		Arrays.asList(row).forEach(i -> sb.append(i).append(SEPARATOR));
		System.out.println(sb.toString());
	}

}
