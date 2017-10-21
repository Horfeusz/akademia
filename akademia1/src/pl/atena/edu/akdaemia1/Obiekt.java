package pl.atena.edu.akdaemia1;

public interface Obiekt {

	static String name() {
		return "Dupa";
	}

	public interface test {

		default int wiek() {
			System.out.println(name());
			return 0;
		};

	}

}
