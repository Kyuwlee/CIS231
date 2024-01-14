public class twodimensional_ex1 {
	public static void main(String[] args) {

		final int ROW = 3;
		final int COL = 3;
		int[][] numbers = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COL; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}
	}
}
