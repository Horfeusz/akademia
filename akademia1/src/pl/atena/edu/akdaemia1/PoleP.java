package pl.atena.edu.akdaemia1;

import java.util.Scanner;

public class PoleP {

	private static Scanner scanner = new Scanner(System.in);

	public static final int MIN = 1;

	public static final int MAX = 2;

	/**
	 * Metoda sprawdza czy podana liczba jest w zakresie MIN MAX
	 * 
	 * @param liczba
	 * @param komunikat
	 * @return
	 */
	public static boolean sprawdz(int liczba, String komunikat) {
		if (!(liczba >= MIN && liczba <= MAX)) {
			System.out.print("liczba " + komunikat + " jest z poza zakresu od 1 do 10");
			return false;
		}
		return true;
	}

	public static String miesiac(int msc) {
		if (msc < 1 || msc > 12) {
			return "Niepoprawna liczba";
		}
		String result = null;
		switch (msc) {
		case 1:
			result = "Styczeñ";
			break;
		case 2:
			result = "Luty";
			break;
		case 3:
			result = "Marzec";
			break;
		default:
			break;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println("Podaj który miesi¹c: ");
		String smiesiac = scanner.nextLine();
		int miesiac = Integer.valueOf(smiesiac);
		System.out.println(miesiac(miesiac));
		
		
		
		
		
		System.out.println("Podaj wartoœæ boku a: ");
		String sa = scanner.nextLine();

		System.out.println("Podaj wartoœæ boku b: ");
		String sb = scanner.nextLine();

		int a = Integer.valueOf(sa);
		int b = Integer.parseInt(sb);

		boolean testa = sprawdz(a, "A");
		boolean testb = sprawdz(b, "B");

		if (!testa || !testb) {
			return;
		}

		if (!testa && !testb) {
			System.out.println("Wez siê ogarnij !!!");
		} else if (testa && !testb) {
			System.out.println("Ju¿ prawie dobrze ale popraw b");
		} else if (!testa && testb) {
			System.out.println("Ju¿ prawie dobrze ale popraw a");
		} else {
			int result = a * b;
			System.out.println(result);
		}

		String tekst = null;
		switch (a) {
		case 1:
			tekst = "jeden";
			break;
		case 2:
			tekst = "dwa";
			break;
		case 3:
			tekst = "trzy";
			break;
		default:
			break;
		}
		System.out.println(tekst);

	}

}
