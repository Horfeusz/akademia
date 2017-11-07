package pl.atena.edu.generyki.zadanie;

public class TestMain {

	public static void main(String[] args) {

		Table<Integer, String> table = new Table<>();
		
		table.add(1, "Krystian D");
		table.add(2, "Krystian B");
		
		table.wyswietlStan();

		System.out.println(table.get(2));
		
		table.remove(1);
		
		System.out.println();
		
		table.wyswietlStan();
		
		
	}

}
