//15/15

import java.io.*;

public class CCC21J3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String preDirection = "";
        while (true) {
            String D = br.readLine();
            if (D.equals("99999")) {
                break;
            }

            String direction = "";
            int pos1 = D.charAt(0) - '0';
            int pos2 = D.charAt(1) - '0';

            if ((pos1 + pos2) == 0) {
                direction = preDirection;
            } else if ((pos1 + pos2) % 2 == 1) {
                direction = "left";
            } else {
                direction = "right";
            }

            System.out.println(direction + ' ' + D.substring(2));
            preDirection = direction;
        }
    }
}