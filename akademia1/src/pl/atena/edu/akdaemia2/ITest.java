package pl.atena.edu.akdaemia2;

public interface ITest {

	static String test() {
		return "No kurcze";
	}
	
	default String test2() {
		return "sdsd";
	}
}
