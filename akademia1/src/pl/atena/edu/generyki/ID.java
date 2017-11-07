package pl.atena.edu.generyki;

/**
 * Klasa ID pochodząca z {@link AId} z typem generycznym T
 * 
 * @author michalh
 *
 * @param <T>
 */
public class ID<T> extends AId {

	/** Wartość IDika określana na podstawie parametryzowanego typu */
	private T value;

	public ID(T value) {
		super();
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see pl.atena.edu.generyki.AId#przedstawSie()
	 */
	@Override
	String przedstawSie() {
		return value.toString();
	}

}
