package pl.atena.edu.strumienie;

import java.util.Arrays;
import java.util.List;

import pl.atena.edu.akdaemia5.AWczytajPlik;

public class Przyklad1 extends AWczytajPlik {

	private StringBuffer sb = new StringBuffer();

	public Przyklad1() {
		wczytajPlik("d:\\test\\akademia\\dok.txt");
	}

	@Override
	protected void przetwarzajLinie(String wiersz) {
		sb.append(wiersz).append(' ');
	}

	public List<String> getSlowa() {
		return Arrays.asList(sb.toString().split("\\PL+"));
	}

	/**
	 * Korzystanie z standardowego iteratora
	 */
	public void iterator() {
		int licznik = 0;
		for (String slowo : getSlowa()) {
			if (slowo.length() > 10) {
				licznik++;
			}

		}
		System.out.println(licznik);

		// Nie mogę w lambdzie :-)
		// slowa.forEach(item -> {
		// if (item.length() > 10) {
		// licznik++;
		// }
		// });
	}

	/**
	 * Korzystanie z strumienia
	 */
	public void strumien() {
		long licznik = getSlowa().stream().filter(slowo -> slowo.length() > 10).count();
		System.out.println(licznik);
	}

	public static void main(String[] argc) {
		Przyklad1 p = new Przyklad1();

		p.iterator();
		p.strumien();
	}

}
