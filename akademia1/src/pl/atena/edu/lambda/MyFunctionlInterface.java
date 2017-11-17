package pl.atena.edu.lambda;

/**
 * Własny przykładowy interfejs funkcjonalny
 * 
 * @author michalh
 *
 */
@FunctionalInterface
public interface MyFunctionlInterface {

	/**
	 * Metoda która coś będzie robić z sentencją
	 * 
	 * @param sentence
	 */
	void fire(String sentence);
}
