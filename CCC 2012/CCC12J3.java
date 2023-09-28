import java.util.*;

public class CCC12J3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = Integer.parseInt(sc.nextLine());
        sc.close();
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < k; j++) {
                System.out.print("x");
            }
            for (int j = 0; j < k; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k;j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*k; j++) {
                System.out.print("x");
            }
            System.out.println();
        }
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < k; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < k; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}