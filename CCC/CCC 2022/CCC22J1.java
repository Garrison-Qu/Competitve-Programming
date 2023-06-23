//15/15
import java.util.*;

public class CCC22J1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int R = input.nextInt();
        int S = input.nextInt();
        input.close();

        int leftover = (8 * R + 3 * S) - 28;
        System.out.println(leftover);
    }
}