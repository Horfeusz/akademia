package pl.atena.edu.akdaemia5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class AWczytajPlik {

	protected Logger logger = Logger.getGlobal();

	/**
	 * Metoda odczytująca dane z pliku
	 * 
	 * @param source
	 */
	public void wczytajPlik(String source) {
		wczytajPlik(source, Level.ALL);
	}

	/**
	 * Metoda odczytująca dane z pliku
	 * 
	 * @param source
	 */
	public void wczytajPlik(String source, Level level) {
		try {
			logger.setLevel(level);
			File file = new File(source);
			logger.info("Wczytano: " + source + "\n");

			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				przetwarzajLinie(line);
			}
			sc.close();
			logger.info("Zakończono przetwarzanie: " + source + "\n");
		} catch (FileNotFoundException e) {
			logger.severe(e.getLocalizedMessage());
			logger.throwing("AWczytajPlik", "wczytajPlik", e);
		}
	}

	abstract protected void przetwarzajLinie(String wiersz);

}
