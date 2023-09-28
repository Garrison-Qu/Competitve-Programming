//15/15

import java.util.*;

public class CCC17J3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int t = sc.nextInt();
        sc.close();

        int x = Math.abs((c-a));
        int y = Math.abs((d-b));

        if (t < (x+y)) {
            System.out.println("N");
        } else if ((t - x - y) % 2 == 0) {
            System.out.println("Y");
        } else {
            System.out.println("N");
        }
    }
}
