//15/15

import java.util.*;

public class CCC19J1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int A3 = sc.nextInt();
        int A2 = sc.nextInt();
        int A1 = sc.nextInt();
        int B3 = sc.nextInt();
        int B2 = sc.nextInt();
        int B1 = sc.nextInt();
        sc.close();

        if (A3*3 + A2*2 + A1*1 > B3*3+B2*2+B1) {
            System.out.println("A");
        } else if (A3*3 + A2*2 + A1*1 < B3*3+B2*2+B1) {
            System.out.println("B");
        } else {
            System.out.println("T");
        }
    }
}
