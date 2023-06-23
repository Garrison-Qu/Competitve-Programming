//15/15

import java.io.*;
import java.util.Scanner;

public class CCC19J2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] num = new int[N];
        char[] character = new char[N];
        for (int i = 0; i < N; i++) {
            num[i] = sc.nextInt();
            character[i] = sc.next().charAt(0);
        }
        sc.close();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < num[i] - 1; j++) {
                System.out.print(character[i]);
            }
            System.out.println(character[i]);
        }
    }
}