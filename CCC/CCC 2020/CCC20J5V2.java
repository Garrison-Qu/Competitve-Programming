//unsolved

import java.io.*;

public class CCC20J5V2 {
    static int x, y, currentX, currentY;
    static int value [] [] = new int [1001] [1001];
    static boolean searched [] [] = new boolean [1001] [1001];
    static boolean noSol;
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);

        st.nextToken();
        y = (int) st.nval;
        st.nextToken();
        x = (int) st.nval;

        currentX = 1;
        currentY = 1;

        for (int i = 1; i < y+1; i++) {
            for (int j = 1; j < x+1; i++) {
                st.nextToken();
                value [j] [i] = (int) st.nval;
            }
        }

        escape(x, y, currentX, currentY);
        if (noSol) {
            System.out.println("no");
        } else {
            System.out.println("yes");
        }
    }

    public static void escape (int x, int y, int currrentX, int currentY) {
        for (int i = y; i > 1; i--) {
            for (int j = x; j > 1; j--) {
                if (value[j] [i] % x == 0 && searched [j] [i] == false) {
                    noSol = false;
                    currentX = j;
                    currentY = i;
                    if (currentX != x && currentY != y) {
                        searched [j] [i] = true;
                        escape(x, y, currrentX, currentY);
                    } 
                } 
                if (i == 1 && j == 1) {
                    noSol = true;
                }
            }
        }
    }
}
