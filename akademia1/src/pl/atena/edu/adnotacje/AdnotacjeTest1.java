package pl.atena.edu.adnotacje;

import java.util.Arrays;
import java.util.logging.Logger;

import pl.atena.edu.akdaemia1.Osoba;

public class AdnotacjeTest1 {

	private void loguj(Object object) {
		Logger logger = Logger.getGlobal();
		Log log = object.getClass().getAnnotation(Log.class);
		if (log == null) {
			return;
		}
		LogSource source = log.type();
		String[] message = log.messages();
		if (LogSource.CONSOLA.equals(source)) {
			StringBuffer sb = new StringBuffer();
			Arrays.asList(message).forEach(item -> sb.append(item).append(" "));
			sb.append(object);
			logger.info(sb.toString());
		} else if (LogSource.FILE.equals(source)) {
			// TODO
		}

	}

	public void test(Osoba osoba) {
		loguj(osoba);
		// TODO coś ta maetoda robi
	}

	public static void main(String[] args) {
		AdnotacjeTest1 test = new AdnotacjeTest1();
		Osoba ja = new Osoba("Michal", "Hoffmann", 40, 180);
		test.test(ja);

	}

}
