import java.util.Arrays;

public class Zad13 {

	public static void main(String[] args) {
		int tab[] = new int[10], liczba = 9;
		for (int i = 0; i < tab.length; i++, liczba--, System.out.println(i)) {
			tab[i] = liczba;
			System.out.printf("%4d", tab[i]);
		}
		
		

	}

}
