import java.util.Scanner;

public class CCC20J5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int y = input.nextInt();
        int x = input.nextInt();

        int[][] value;
        value = new int[x][y];
        int currentX = 0;
        int currentY = 0;

        boolean yes = false;

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                value[i][j] = input.nextInt();
            }
        }
        input.close();

        for (int p = 0; p < x * y; p++) {
            for (int i = 0; x - i >= 0; i++) {
                for (int j = 0; y - j >= 0; j++) {
                    if ((x - i + 1) * (y - j + 1) == value[currentX][currentY]) {
                        currentX = x - i;
                        currentY = y - j;
                    }

                    if (currentX == (x - 1) && currentY == (y - 1)) {
                        yes = true;
                        break;
                    }
                }
                if (currentX == (x - 1) && currentY == (y - 1)) {
                    yes = true;
                    break;
                }
            }
            if (currentX == (x - 1) && currentY == (y - 1)) {
                yes = true;
                break;
            }
        }

        if (yes) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}