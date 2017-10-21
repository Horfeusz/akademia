package pl.atena.edu.akdaemia5;

import java.util.Arrays;

public class WczytajPlikInaczej extends AWczytajPlik {

	private static final String SEPARATOR = " ";

	private int index = 0;

	@Override
	protected void przetwarzajLinie(String wiersz) {
		if (++index == 1) {
			return;
		}
		String[] row = wiersz.split(";");
		StringBuilder sb = new StringBuilder();
		Arrays.asList(row).forEach(i -> sb.append(i).append(SEPARATOR));
		System.out.println(sb.toString());		
	}

}
