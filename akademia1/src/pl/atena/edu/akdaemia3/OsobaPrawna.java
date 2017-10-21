package pl.atena.edu.akdaemia3;

/**
 * Obiekt reprezentujący osoby prawne
 */
public class OsobaPrawna implements Obiekt {

	private String nazwa;

	public OsobaPrawna(String nazwa) {
		this.nazwa = nazwa;
	}

	@Override
	public String nazwa() {
		return nazwa;
	}

}
