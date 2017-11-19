package pl.edu.atena.sklep;

/**
 * Rodzaje towarów
 * 
 * @author michalh
 *
 */
public enum RodzajTowaru {

	@SprawdzWiek(wiek = 16)
	PIWO,

	@SprawdzWiek
	FAJKI,

	POMARANCZA,

	MLEKO,

	MASLO;

}
