package pl.atena.edu.akdaemia2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tablice {

	public static <T> List<T> tab() {
		return new ArrayList<T>();
	}

	public static void main(String[] args) {

		
		String[] test = new String[10];
		Arrays.fill(test, "dupa");
		Arrays.sort(test);
		System.out.println(Arrays.toString(test));
		
		List<String> list = tab();
		list.add("Kupa");
		
		System.out.println(list);
	}

}
