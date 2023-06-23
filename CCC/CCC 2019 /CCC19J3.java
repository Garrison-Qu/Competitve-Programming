//Error

import java.util.*;

public class CCC19J3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());
        char[][] character = new char[N][80];
        int counter = 1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 80; j++) {
                character[i][j] = sc.next().charAt(0);
                if (character[i][j] == ' ') {
                    break;
                }
            }
        }
        sc.close();

        for (int i = 0; i < N; i++) {
            for (int j =0; j < 80; j++) {
                if (check(character[i][j], character[i][j+1])) {
                    counter++;
                } else {
                    System.out.print(counter + " " + character[i][j]);
                    counter = 1;
                }
                if (character[i][j] == ' ') {
                    System.out.println("");
                    break;
                }
            }
        }
    }

    public static boolean check (char a, char b) {
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }
}
