package pl.atena.edu.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import pl.atena.edu.akdaemia1.Osoba;

public class LambdaTest4 {

	public static void zadanie(List<Osoba> osoby, Consumer<Osoba> consumer) {
		osoby.forEach(consumer::accept);
	}

	public static void main(String[] args) {

		Consumer<Osoba> wyswietl = item -> {
			StringBuffer sb = new StringBuffer();
			sb.append(item.getNazwisko()).append(" ").append(item.getImie()).append(" ")
					.append(item.pelnoletni() ? "pełnoletni" : "NIEPEŁNOLETNI").append(" ").append(item.getWiek());
			System.out.println(sb.toString());
		};

		List<Osoba> osoby = new ArrayList<>();
		osoby.add(new Osoba("Jan", "Kowalski", 12, 140));
		osoby.add(new Osoba("Henryk", "Załoga", 56, 190));
		osoby.add(new Osoba("Julia", "Pająk", 17, 170));
		osoby.add(new Osoba("Wacław", "Zioło", 44, 170));

		zadanie(osoby, wyswietl);

		zadanie(osoby, item -> item.dodajLat(1));

		System.out.println();

		zadanie(osoby, wyswietl);

	}

}
