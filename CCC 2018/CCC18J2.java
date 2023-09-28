import java.util.*;

public class CCC18J2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String a = sc.nextLine();
        String b = sc.nextLine();
        sc.close();

        int counter = 0;

        for (int i = 0; i < N; i++) {
            if (a.charAt(i) == 'C' && b.charAt(i) == 'C') {
                counter++;
            }
        }

        System.out.println(counter);
    }
}
