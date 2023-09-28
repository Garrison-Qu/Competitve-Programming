//15/15
import java.util.*;

public class CCC22J2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int count = 0;

        int[] points = new int[num];
        int[] fouls = new int[num];
        for (int i = 0; i < num; i++) {
            points[i] = input.nextInt();
            fouls[i] = input.nextInt();
        }
        input.close();

        for (int j = 0; j < num; j++) {
            if ((points[j] * 5 - fouls[j] * 3) > 40) {
                count++;
            }
        }

        if (count == num) {
            System.out.println(count + "+");
        } else {
            System.out.println(count);
        }
    }
}