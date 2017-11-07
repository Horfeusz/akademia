package pl.atena.edu.generyki;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.logging.Logger;

/**
 * Obiekt testowy do pokazania możliwości metod z generycznymi typami
 * 
 * @author michalh
 *
 */
public class GenericMethods {

	private Logger logger = Logger.getLogger(GenericMethods.class.getCanonicalName());

	/**
	 * Metoda test z paramtryzowalnym typem T
	 * 
	 * @param parametr
	 */
	public <T> void test(T parametr) {
		logger.info(parametr.toString());
	}

	/**
	 * Przeciążona metoda test z paramtryzowalnymi typami
	 * 
	 * @param param1
	 * @param param2
	 */
	public <Z> void test(Z param1, Z param2) {
		List<Z> list = new ArrayList<>();
		list.add(param1);
		list.add(param2);

		logger.info(list.toString());
	}

	/**
	 * Kolejna przeciążona metoda test
	 * 
	 * @param param1
	 * @param param2
	 * @param param3
	 */
	public <T, Z> void test(Z param1, T param2, T param3) {
		// TODO...
	}

	/**
	 * Wyświetlam przekazaną list
	 * 
	 * @param lista
	 */
	public void iDiki(List<? extends AId> lista) {
		lista.forEach(x -> logger.info(x.przedstawSie()));
	}

	/**
	 * Filtrowanie listy
	 * 
	 * @param lista
	 *            lista która będzie filtrowana
	 * @param pre
	 *            warunki po jakich ma być filtrowana lista
	 */
	public <T extends AId> void filtruj(List<T> lista, Predicate<? super T> pre) {
		List<T> result = new ArrayList<>();
		lista.forEach(item -> {
			if (pre.test(item)) {
				result.add(item);
			}
		});
		result.forEach(item -> logger.info(item.przedstawSie()));
	}

}
