
public class Zad10 {

	public static void main(String[] args) {

		int suma = 0, iter = 0;
		while (iter <= 100) {
			suma += ++iter % 2 == 0 ? iter : 0;
		}
		System.out.println(suma);

	}

}
