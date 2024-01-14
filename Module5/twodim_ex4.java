import java.util.Random;
import java.util.Arrays;

public class twodim_ex4 {
	public static void main(String[] args) {
		Random rdnum = new Random();
		final int ROW = 5;
		final int COL = 3;
		int[][] numbers = new int[ROW][COL];
		int[] rowsum = { 0, 0, 0, 0, 0 };
		int[] colsum = { 0, 0, 0 };

		// Generate randon numbers and fill up the two dimensional array.
		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COL; j++) {
				numbers[i][j] = rdnum.nextInt(10);
			}
		}
		// Print all elements in two dimensional array
		for (int i = 0; i < numbers.length; i++)
			System.out.println(Arrays.toString(numbers[i]));

		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COL; j++) {
				rowsum[i] += numbers[i][j];
			}
			System.out.println("The sum of row " + i + " = " + rowsum[i]);
		}
		for (int i = 0; i < COL; i++) {
			for (int j = 0; j < ROW; j++) {
				colsum[i] += numbers[j][i];
			}
			System.out.println("The sum of column " + i + " = " + colsum[i]);
		}

	}

}
