import java.io.*;

public class CCC11J4 {
    static boolean[][] drilled = new boolean[402][201];
    static int x = 200;
    static int y = 1;
    static boolean read = true;
    static boolean safe;
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);

        down(2);
        right(3);
        down(2);
        right(2);
        up(2);
        right(2);
        down(4);
        left(8);
        up(2);
        
        while (read) {
            st.nextToken();
            if (st.sval.charAt(0) == 'd') {
                st.nextToken();
                int n = (int) st.nval;
                down(n);
            } else if (st.sval.charAt(0) == 'u') {
                st.nextToken();
                int n = (int) st.nval;
                up(n);
            } else if (st.sval.charAt(0) == 'r') {
                st.nextToken();
                int n = (int) st.nval;
                right(n);
            } else if (st.sval.charAt(0) == 'l') {
                st.nextToken();
                int n = (int) st.nval;
                left(n);
            } else {
                read = false;
            }
            if (safe && read) {
                System.out.println((x-200) + " " + (-y) + " safe");
            } else if (!safe && read) {
                read = false;
                System.out.println((x-200) + " " + (-y) + " DANGER");
            }
        }
    }

    public static void down (int n) {
        safe = true;
        for (int i = 1; i <= n; i++) {
            if (drilled[x][y+i] == true){
                safe = false;
            }
            drilled[x][y+i] = true;
        }
        y += n;
    }

    public static void up (int n) {
        safe = true;
        for (int i = 1; i <= n; i++) {
            if (drilled[x][y-i] == true){
                safe = false;
            }
            drilled[x][y-i] = true;
        }
        y -= n;
    }

    public static void right (int n) {
        safe = true;
        for (int i = 1; i <= n; i++) {
            if (drilled[x+i][y] == true){
                safe = false;
            }
            drilled[x+i][y] = true;
        }
        x += n;
    }

    public static void left (int n) {
        safe = true;
        for (int i = 1; i <= n; i++) {
            if (drilled[x-i][y] == true){
                safe = false;
            }
            drilled[x-i][y] = true;
        }
        x -= n;
    }
}