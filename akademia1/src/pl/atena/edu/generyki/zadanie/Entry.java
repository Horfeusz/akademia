package pl.atena.edu.generyki.zadanie;

/**
 * Klasa reprezentująca pojedyńy element w mojej mapie
 * 
 * @author michalh
 *
 * @param <K>
 * @param <V>
 */
public class Entry<K, V> {

	private K key;

	private V value;

	public Entry() {
		super();
	}

	public Entry(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.format("Entry [key=%s, value=%s]", key, value);
	}

}
