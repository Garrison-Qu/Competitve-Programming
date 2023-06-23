//15/15

import java.util.*;

public class CCC17J4 {

    static int a = 1;
    static int b = 2;
    static int c = 0;
    static int d = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        int Day = (int) N / 720;

        int counter = 0;

        for (int i = 0; i < N % 720; i++) {
            d++;
            timeSystem();
            int r = c - d;
            if (a == 0) {
                if (r == b - c && r == c - d) {
                    counter++;
                }
            } else {
                if (r == a - b && r == b - c && r == c - d) {
                    counter++;
                }
            }
        }
        System.out.println(counter + Day * 31);
    }

    public static void timeSystem() {
        if (d == 10) {
            d = 0;
            c++;
        }
        if (c == 6) {
            c = 0;
            b++;
        }
        if (b == 10) {
            b = 0;
            a++;
        }
        if (a == 1 && b == 3) {
            a = 0;
            b = 1;
            c = 0;
            d = 0;
        }
    }
}
