package pl.atena.edu.strumienie;

import java.util.Optional;
import java.util.stream.Stream;

public class OperacjeRedukcji {

	public static void main(String[] args) {

		Stream<Integer> s = Stream.of(1, 2, 3, 4, 5, 6);

		Optional<Integer> suma = s.reduce((x, y) -> {
			System.out.println(String.format("x=%s, y=%s", x, y));
			return x * y;
		});

		System.out.println(suma.get());

		// Short ver 1
		// Optional<Integer> suma = s.reduce((x, y) -> x * y);

	}
}
