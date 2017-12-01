package pl.atena.edu.strumienie;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

public class TypOptional {

	public static Optional<String> createOptional(String value) {
		return value.isEmpty() ? Optional.empty() : Optional.of(value);
	}

	public static Optional<Integer> createOptional(Integer value) {
		return Optional.ofNullable(value);
		// value == null ? Optional.empty() : Optional.of(value);
	}

	public static void main(String[] args) {

		Optional<Integer> o1 = Stream.of(24, 6, 8, 2, 4, 6, 88).filter(item -> item < 0).findAny();
		// Liczba lub jeżeli 0 jeżeli brak
		System.out.println("Dowolna liczba: " + o1.orElse(-100));

		Optional<Integer> o2 = Stream.of(24, 6, 8, 2, 4, 6, 88).filter(item -> item < 0).findAny();
		// Liczba lub
		System.out.println("Dowolna liczba: " + o2.orElseGet(() -> {
			int result = -100 * 2;
			System.out.println("No nic nie znalazłem na liście zatem zwrócę ");
			return result;
		}));

		try {
			Optional<Integer> o3 = Stream.of(24, 6, 8, 2, 4, 6, 88).filter(item -> item < 0).findAny();
			System.out.println("Dowolna liczba: " + o3.orElseThrow(IllegalStateException::new));
		} catch (Exception e) {
			e.printStackTrace();
		}

		Set<Integer> set = new HashSet<>();
		Optional<Integer> o4 = Stream.of(24, 6, 8, 2, 4, 6, 88).filter(item -> item < 5).findFirst();
		o4.ifPresent(set::add);

	}

}
