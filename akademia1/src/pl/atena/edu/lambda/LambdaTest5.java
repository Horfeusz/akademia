package pl.atena.edu.lambda;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class LambdaTest5 {

	public static void main(String[] args) {

		// http://ggoralski.pl/?p=1942

		MyFunctionlInterface mysl = (m) -> System.out.println("Tak pomyślałem: " + m);
		mysl.fire("Kiedy będzie obiad");
		System.out.println();

		mysl = (m) -> {
			int year = LocalDate.now().getYear();
			LocalDate dp = LocalDate.of(year + 1, 1, 1).plusDays(256);
			DateTimeFormatter formatterD = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
			String formatted = formatterD.format(dp);

			StringBuilder sb = new StringBuilder();
			sb.append("Dzień programisty: ").append(formatted).append("\n").append(m);
			System.out.println(sb.toString());
		};
		mysl.fire("To chyba będzie wspaniały dzień !!");

	}

}
