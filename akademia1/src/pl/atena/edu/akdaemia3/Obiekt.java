package pl.atena.edu.akdaemia3;

/**
 * Interfejs reprezentujący obiekty w kartotece
 */
public interface Obiekt {

	/**
	 * Metoda zwracająca nazwę obiektu
	 * 
	 * @return
	 */
	default String nazwa() {
		return "Niezidentyfikowany obiekt";
	};

}
