import java.util.Scanner;

public class CCC20J1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int output;
        int S = in.nextInt();
        int M = in.nextInt();
        int L = in.nextInt();
        output = S + 2 * M + 3 * L;
        if (output >= 10) {
            System.out.println("happy");
        } else {
            System.out.println("sad");
        }
        in.close();
    }
}