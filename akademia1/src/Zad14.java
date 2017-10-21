import java.util.Arrays;

public class Zad14 {

	public static void main(String[] args) {
		int[][] tab = { { 1 }, { 1, 2 }, { 1, 2, 3, 4 }, {} };

		for (int[] wiersz : tab) {
			for (int element : wiersz) {
				System.out.printf("%4d", element);
			}
			System.out.println();
		}

		int[][] tab2 = new int[3][];
		tab2[0] = new int[6];
		tab2[1] = new int[2];
		
		System.out.print(Arrays.toString(tab2));
	}

}
