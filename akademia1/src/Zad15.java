import java.util.Arrays;

public class Zad15 {

	public static void main(String[] args) {

		int[][] tab = new int[10][10];

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (i == j || i + j == 9) {
					tab[i][j] = 1;
				}
				//System.out.printf("%4d", tab[i][j]);
			}
			//System.out.println();
		}
		
		int[][] tab2 = new int[2][];
		int[] tab3 = new int[5];
		Arrays.fill(tab2, Arrays.copyOf(tab3, 5));
		
		for (int[] wiersz : tab2) {
			for (int element : wiersz) {
				System.out.printf("%4d", element);
			}
			System.out.println();
		}

		tab2[0][1] = 10;
		for (int[] wiersz : tab2) {
			for (int element : wiersz) {
				System.out.printf("%4d", element);
			}
			System.out.println();
		}
		
		
		
		
	}

}
