package pl.atena.edu.akdaemia1;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Obiekt.test> list = new ArrayList<>();
		list.add(new Pojazd());
		list.add(new Samolot());

		list.forEach(System.out::println);
		list.forEach(x -> System.out.println(x.wiek()));
		
		
	}

}
