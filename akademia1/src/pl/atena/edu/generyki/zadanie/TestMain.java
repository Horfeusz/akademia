package pl.atena.edu.generyki.zadanie;

public class TestMain {

	public static void main(String[] args) {

		// Tworze kontener
		Table<Integer, String> table = new Table<>();

		// Dodaje wartości do kontenera
		table.add(1, "Krystian D");
		table.add(2, "Krystian B");
		table.add(3, "Ewa Ł");
		table.add(4, "Arkadiusz K");
		table.add(5, "Jurek Ł");
		table.wyswietlStan();

		// Aktualizuje wartość
		table.add(5, "Rober P");
		table.wyswietlStan();

		// Pobieram po kluczu
		System.out.println(table.get(2));
		System.out.println();

		System.out.println(table.get(20));
		System.out.println();

		// Usuwam z kontenera
		table.remove(1);
		table.wyswietlStan();

	}

}
