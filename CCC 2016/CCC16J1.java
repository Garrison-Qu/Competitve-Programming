import java.util.*;

public class CCC16J1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        for (int i = 0; i < 6; i++) {
            if (sc.nextLine().charAt(0) == 'W') {
            counter++;
            }
        }
        sc.close();
        if (counter == 5 || counter == 6) {
            System.out.println("1");
        } else if (counter == 3 || counter == 4) {
            System.out.println("2");
        } else if (counter == 1 || counter == 2) {
            System.out.println("3");
        } else {
            System.out.println("-1");
        }
    }
} 