package pl.atena.edu.generyki.zadanie;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

/**
 * Klasa imitująca hashMape
 * 
 * @author michalh
 *
 * @param <K>
 * @param <V>
 */
public class Table<K, V> {

	/** Lista przechowująca elementy typu Entry */
	private List<Entry<K, V>> list = new ArrayList<>();

	/**
	 * Przeszukuje mój kontener po kluczu
	 * 
	 * @param key
	 * @return
	 */
	private Entry<K, V> filtruj(K key) {
		Objects.requireNonNull(key, "Nie można wyszukiwać po wartości klucza równej NULL");
		Predicate<Entry<K, V>> pre = (value) -> value.getKey().equals(key);
		for (Entry<K, V> entry : list) {
			if (pre.test(entry)) {
				return entry;
			}
		}
		return null;
	}

	/**
	 * Dodanie elementu do listy
	 * 
	 * @param key
	 *            klucz
	 * @param value
	 *            wartość
	 */
	public boolean add(K key, V value) {
		return add(new Entry<>(key, value));
	}

	/**
	 * Dodaje lement do listy
	 * 
	 * @param entry
	 */
	public boolean add(Entry<K, V> entry) {
		Objects.requireNonNull(entry, "Element który próbujesz dodać do kontenera jest równy NULL");
		Objects.requireNonNull(entry.getKey(), "Klucz elementu który próbujesz do kontenera jest równy NULL");
		Entry<K, V> element = filtruj(entry.getKey());
		if (element == null) {
			return list.add(entry);
		}

		// TODO - przydałaby się metoda set
		element.setValue(entry.getValue());
		return false;
	}

	/**
	 * Pobranie wartości elementu z kontenera po kluczu
	 * 
	 * @param key
	 * @return
	 */
	public V get(K key) {
		Entry<K, V> entry = filtruj(key);
		return entry != null ? entry.getValue() : null;
	}

	/**
	 * Usunięcie elementu z kontenera po kluczu
	 * 
	 * @param key
	 * @return
	 */
	public boolean remove(K key) {
		Entry<K, V> entry = filtruj(key);
		return entry != null ? list.remove(entry) : false;
	}

	/**
	 * Wyświetlanie stanu kontenera
	 */
	public void wyswietlStan() {
		list.forEach(System.out::println);
		System.out.println();
	}

}
