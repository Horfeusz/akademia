package pl.atena.edu.generyki;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Klasa testująca i pokazująca możliwości generyków
 * 
 * @author michalh
 *
 */
public class TestGeneryki {

	public static void testWyswietlListe() {
		List<IDString> l1 = new ArrayList<>();
		l1.add(new IDString("test1"));
		l1.add(new IDString("test2"));

		(new GenericMethods()).iDiki(l1);
	}

	public static void testFiltrujListe() {
		GenericMethods o = new GenericMethods();

		/** Obiekt do filtrowania list */
		Predicate<AId> pre = new Predicate<AId>() {
			@Override
			public boolean test(AId t) {
				return t.przedstawSie().equals("test1");
			}
		};

		List<IDString> l1 = new ArrayList<>();
		l1.add(new IDString("test1"));
		l1.add(new IDString("test2"));

		List<IdStringKey> l2 = new ArrayList<>();
		l2.add(new IdStringKey("1", "test1"));
		l2.add(new IdStringKey("2", "test2"));

		o.filtruj(l1, pre);

		o.filtruj(l2, pre);

	}

	public static void main(String[] args) {

		testWyswietlListe();

		testFiltrujListe();

	}

}
