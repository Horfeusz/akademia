package pl.atena.edu.lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaTest7 {

	public void message(final String message, final int count) {
		Runnable r = () -> {
			for (int i = 0; i < count; i++) {
				System.out.println(message);
			}
		};
		new Thread(r).start();
	}

	public static void main(String[] args) {
		LambdaTest7 l7 = new LambdaTest7();
		l7.message("Komunikat", 5);

		// for (int i = 0; i < 10; i++) {
		// new Thread(() -> System.out.println(i)).start();
		// }

		List<String> lista = Arrays.asList("Krystian", "Anita");
		for (String element : lista) {
			new Thread(() -> System.out.println(element)).start();
		}

	}

}
