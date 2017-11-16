package pl.atena.edu.lamda;

import java.util.function.Consumer;

import pl.atena.edu.akdaemia3.Samochod;

public class Test {

	public static void main(String[] args) {

		// http://ggoralski.pl/?p=1942

		Myslenie mysl = (m) -> System.out.println("Tak pomyślałem: " + m);
		mysl.ognia("Jedziesz stefan");

		mysl = (m) -> {
			System.out.println("Ecie pecie kłębek drutu");
			System.out.println("Tak pomyślałem: " + m);
		};
		mysl.ognia("Jedziesz stefan jeszcze raz");

		Samochod samochod = new Samochod("Ford", "Fiesta");
		Consumer<Samochod> cons = (o) -> System.out.println(o.nazwa());
		cons.accept(samochod);

	}

}
