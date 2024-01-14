import java.util.Scanner;

public class zyLab525 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int N = scnr.nextInt();
		int M = scnr.nextInt();

		int[][] numbers = new int[N][M];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				numbers[i][j] = scnr.nextInt();
			}
		}

		int rowmin, rowmax, rowmax_idx, rowmin_idx;
		int colmin, colmax, colmax_idx, colmin_idx;
		int sum;
		rowmin = rowmax = colmin = colmax = rowmin_idx = rowmax_idx = colmin_idx = colmax_idx = 0;

		for (int i = 0; i < N; i++) {
			sum = 0;
			for (int j = 0; j < M; j++) {
				sum += numbers[i][j];
			}
			if ((i == 0) || (rowmin > sum)) {
				rowmin = sum;
				rowmin_idx = i;
			}
			if ((i == 0) || (rowmax < sum)) {
				rowmax = sum;
				rowmax_idx = i;
			}
		}
		for (int i = 0; i < M; i++) {
			sum = 0;
			for (int j = 0; j < N; j++) {
				sum += numbers[j][i];
			}
			if ((i == 0) || (colmin > sum)) {
				colmin = sum;
				colmin_idx = i;
			}
			if ((i == 0) || (colmax < sum)) {
				colmax = sum;
				colmax_idx = i;
			}
		}
		// System.out.println(Arrays.toString(numbers[rowmin_idx]));
		// System.out.println(Arrays.toString(numbers[rowmax_idx]));
		for (int i = 0; i < M; i++)
			System.out.print(numbers[rowmin_idx][i] + " ");
		System.out.println();
		for (int i = 0; i < M; i++)
			System.out.print(numbers[rowmax_idx][i] + " ");
		System.out.println();
		for (int i = 0; i < N; i++)
			System.out.print(numbers[i][colmin_idx] + " ");
		System.out.println();
		for (int i = 0; i < N; i++)
			System.out.print(numbers[i][colmax_idx] + " ");
		System.out.println();
	}

}
