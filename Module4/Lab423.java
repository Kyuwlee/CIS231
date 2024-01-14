import java.util.Scanner;

public class Lab423 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		int userNum;
		int sum = 0, cnt = 0;
		int min = 0, max = 0;
		double avg;

		while ((userNum = scnr.nextInt()) >= 0) {
			if (cnt == 0) {
				min = max = userNum;
			} else if (userNum < min)
				min = userNum;
			else if (userNum > max)
				max = userNum;

			sum += userNum;
			cnt++;
		}
		if (cnt <= 2) {
			sum = 0;
			avg = 0.0;
		} else {

			sum = sum - min - max;
			avg = sum / (double) (cnt - 2);
		}
		System.out.printf("%d %.2f\n", sum, avg);
		scnr.close();
	}

}
