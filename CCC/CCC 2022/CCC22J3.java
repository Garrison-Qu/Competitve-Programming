//15/15
import java.util.*;

public class CCC22J3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine() + "           ";
        in.close();

        int pos = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '-' || input.charAt(i) == '+') {
                if (input.charAt(i) == '-') {
                    String out = input.substring(pos, i);
                    int numCounter = 0;
                    for (int j = i + 2; j - i <= 6; j++) {
                        if (Character.isDigit(input.charAt(j))) {
                            numCounter++;
                        } else {
                            break;
                        }
                    }
                    String out2 = input.substring(i + 1, i + 2 + numCounter);
                    System.out.print(out + " ");
                    System.out.print("loosen ");
                    System.out.println(out2);
                    pos = i + 2 + numCounter;
                } else {
                    String out = input.substring(pos, i);
                    int numCounter = 0;
                    for (int j = i + 2; j - i <= 6; j++) {
                        if (Character.isDigit(input.charAt(j))) {
                            numCounter++;
                        } else {
                            break;
                        }
                    }
                    String out2 = input.substring(i + 1, i + 2 + numCounter);
                    System.out.print(out + " ");
                    System.out.print("tighten ");
                    System.out.println(out2);
                    pos = i + 2 + numCounter;
                }
            }
        }
    }
}