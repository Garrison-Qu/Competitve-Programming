//15/15

import java.util.Scanner;

public class CCC10J1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        if (N == 1) {
            System.out.println("1");
        } else if (N == 2 || N == 3) {
            System.out.println("2");
        } else if (N == 4 || N == 5) {
            System.out.println("3");
        } else if (N == 6) {
            System.out.println("3");
        } else if (N == 7 || N == 8) {
            System.out.println("2");
        } else if (N == 9 || N == 10) {
            System.out.println("1");
        }
    }
}
