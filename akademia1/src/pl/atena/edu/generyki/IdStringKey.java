package pl.atena.edu.generyki;

/**
 * Klasa Idika pochodzącego od stringa ale zawierającego dodatkowy atrybut key
 * 
 * @author michalh
 *
 */
public class IdStringKey extends IDString {

	/** Dodatkowy atrybut */
	private String key;

	public IdStringKey(String key, String value) {
		super(value);
		this.setKey(key);
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

}
