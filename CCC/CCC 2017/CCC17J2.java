//15/15

import java.util.*;

public class CCC17J2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();
        sc.close();

        System.out.println(output(N, k));
    }

    public static int output (int N, int k) {
        if (k > 0) {
            return N* (int) Math.pow(10, k) + output(N,k-1);
        } else {
            return N;
        }
    }
}
