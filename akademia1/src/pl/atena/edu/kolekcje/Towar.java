package pl.atena.edu.kolekcje;

public enum Towar {

	JABLKO(0) {
		public void gnije() {
			System.out.println("Ja jabłko sobie gnije");
		}
	},

	OGOREK(1) {
		public void gnije() {
			System.out.println("Jak ja gnije to znaczy, że kisnę");
		}
	},

	KAPUSTA(2) {
		public void gnije() {
			System.out.println("Gnijąca kapusta to kiszona kapusta");
		}
	},

	MARCHEW(3) {
		public void gnije() {
			System.out.println("Gnijąca jestem czarna");
		}
	};

	private int code;

	private Towar(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public abstract void gnije();

}
