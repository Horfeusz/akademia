package pl.atena.edu.generyki;

/**
 * Klasa słownika z dwoma typami parametryzowalnymi
 * 
 * @author michalh
 *
 * @param <T>
 *            ten typ określa typ jakim będzie atrybut
 * @param <V>
 *            ten typ określa klase wyjątku jaką można rzucać w tej klasie i
 *            jaką rzuca metoda test
 */
public class Slownik<T, V extends Throwable> {

	public void test() throws V {
		// TODO ...
	}

	T id;

	public T getId() {
		return id;
	}

	public void setId(T id) {
		this.id = id;
	}

}
