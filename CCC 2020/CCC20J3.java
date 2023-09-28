import java.util.Scanner;

public class CCC20J3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = Integer.parseInt(input.nextLine());

		int[] x = new int[num];
		int[] y = new int[num];

		for (int i = 0; i < num; i++) {
			String[] inputNum = input.nextLine().split(",");
			x[i] = Integer.parseInt(inputNum[0]);
			y[i] = Integer.parseInt(inputNum[1]);
		}
		input.close();

		int xMin = Integer.MAX_VALUE;
		int xMax = Integer.MIN_VALUE;
		int yMin = Integer.MAX_VALUE;
		int yMax = Integer.MIN_VALUE;

		for (int i = 0; i < num; i++) {
			if (x[i] < xMin) {
				xMin = x[i];
			}
			if (x[i] > xMax) {
				xMax = x[i];
			}
			if (y[i] < yMin) {
				yMin = y[i];
			}
			if (y[i] > yMax) {
				yMax = y[i];
			}
		}

		System.out.println((xMin - 1) + "," + (yMin - 1));
		System.out.println((xMax + 1) + "," + (yMax + 1));
	}
}