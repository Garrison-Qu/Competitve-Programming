import java.util.*;

public class CCC14J2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String st = sc.nextLine();
        sc.close();

        int A = 0;
        int B = 0;

        for (int i = 0; i < N; i++) {
            if (st.charAt(i) == 'A') {
                A++;
            } else {
                B++;
            }
        }

        if (A > B) {
            System.out.println("A");
        } else if (B == A) {
            System.out.println("Tie");
        } else {
            System.out.println("B");
        }
    }
}
