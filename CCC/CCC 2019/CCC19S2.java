//15/15

import java.util.*;

public class CCC19S2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int qty = sc.nextInt();
        int[] target = new int[qty];
        for (int i = 0; i < qty; i++) {
            target[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 0; i < qty; i++) {
            for (int j = 0; target[i] - j > 1; j++) {
                if (target[i] % 2 == 0) {
                    j++;
                }
                if (isPrime(target[i]-j) && isPrime(target[i]+j)) {
                    System.out.println((target[i]-j) + " " + (target[i]+j));
                    break;
                }
            }
        }

    }

    static boolean isPrime(int n){
        if (n <= 1)
            return false;
  
        for (int i = 2; i * i <= n; i++)
            if (n % i == 0)
                return false;

        return true;
    }
}