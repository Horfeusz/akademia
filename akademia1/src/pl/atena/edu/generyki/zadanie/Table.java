package pl.atena.edu.generyki.zadanie;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Table<K, V> {

	private List<Entry<K, V>> list = new ArrayList<>();

	private Entry<K, V> filtruj(K key) {
		Predicate<Entry<K, V>> pre = new Predicate<Entry<K, V>>() {
			@Override
			public boolean test(Entry<K, V> t) {
				return t.getKey().equals(key);
			}
		};
		for (Entry<K, V> entry : list) {
			if (pre.test(entry)) {
				return entry;
			}

		}
		return null;
	}

	public void add(K key, V value) {
		list.add(new Entry<>(key, value));
	}

	public void add(Entry<K, V> entry) {
		list.add(entry);
	}

	public V get(K key) {
		Entry<K, V> entry = filtruj(key);
		return entry != null ? entry.getValue() : null;
	}

	public boolean remove(K key) {
		Entry<K, V> entry = filtruj(key);
		return entry != null ? list.remove(entry) : false;
	}

	public void wyswietlStan() {
		list.forEach(System.out::println);
	}

}
