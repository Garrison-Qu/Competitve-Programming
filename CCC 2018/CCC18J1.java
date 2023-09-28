//15/15

import java.util.*;

public class CCC18J1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        sc.close();

        if ((int) a/2 == 4 && (int) d/2 == 4 && b == c) {
            System.out.println("ignore");
        } else {
            System.out.println("answer");
        }
    }
}