package pl.atena.edu.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import pl.atena.edu.akdaemia1.Osoba;

public class LambdaTest10 {

	public static void test1() {

		List<Osoba> list = new ArrayList<>();
		list.add(Osoba.instance("Kasia"));
		list.add(Osoba.instance("Adam"));
		list.add(Osoba.instance("Zenek"));

		list.sort(Comparator.comparing(Osoba::getImie));
		list.forEach(System.out::println);
	}

	public static void test2() {

		List<Osoba> list = new ArrayList<>();
		list.add(new Osoba("Kasia", "Kowalska"));
		list.add(new Osoba("Kasia", "Adamkiewicz"));
		list.add(new Osoba("Adam", "Trąbalski"));
		list.add(new Osoba("Adam", "Kowalski"));

		list.sort(Comparator.comparing(Osoba::getImie).thenComparing(Osoba::getNazwisko));
		list.forEach(System.out::println);
	}

	public static void main(String[] args) {
		test1();
		System.out.println();
		test2();

	}

}
