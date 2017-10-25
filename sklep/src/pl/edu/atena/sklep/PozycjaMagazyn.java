package pl.edu.atena.sklep;

/**
 * Klasa zawierająca informacje na temat pozycji magazynowej
 * 
 * @author michalh
 *
 */
public class PozycjaMagazyn {

	/** Towar */
	private Towar towar;

	/** Ilość towaru na magazynie */
	private int ilosc;

	/**
	 * Konstruktor
	 * 
	 * @param towar
	 * @param ilosc
	 */
	public PozycjaMagazyn(Towar towar, int ilosc) {
		super();
		this.towar = towar;
		this.ilosc = ilosc;
	}

	public Towar getTowar() {
		return towar;
	}

	public void setTowar(Towar towar) {
		this.towar = towar;
	}

	public int getIlosc() {
		return ilosc;
	}

	public void setIlosc(int ilosc) {
		this.ilosc = ilosc;
	}

	/**
	 * Dodanie towaru do magazynu
	 * 
	 * @param ilosc
	 *            ilość dodawanego towaru
	 */
	public void dodajilosc(int ilosc) {
		this.ilosc += ilosc;
	}

	/**
	 * Zdjęcie towaru z magazynu
	 * 
	 * @param ilosc
	 *            ilość zdejmowanego towaru
	 */
	public void zdejmijilosc(int ilosc) {
		this.ilosc -= ilosc;
	}

}
