package pl.atena.edu.akdaemia3;

import java.util.Arrays;

/**
 * Obiekty implementujące ten interfejs mogą zwrócić swoją reprezentacje w
 * postaci pliku wiersza CSV
 */
public interface Csv {

	String SEPARATOR = ";";

	String toCsv();

	default String nazwa() {
		return "Csv: " + toCsv();
	};

	/**
	 * MEtoda zamienia podaną tablice stringów na woersz w formacie CSV
	 */
	static String toCsv(String... params) {
		if (params == null) {
			return null;
		}
		StringBuilder sb = new StringBuilder();
		Arrays.asList(params).forEach(i -> sb.append(i).append(SEPARATOR));
		return sb.toString();
	}

}
