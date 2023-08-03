import java.io.*;

public class CCC18J4{

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StreamTokenizer st = new StreamTokenizer(br);

    public static void main (String[] args) throws IOException{
        st.nextToken();
        int N = (int) st.nval;
        int[] [] value = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                st.nextToken();
                value[i] [j] = (int) st.nval;
            }
        }
    }

    public static boolean counterClock(int N, int[][]value) {
        int iff = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N-1; j++) {
                if (value [j] [i] <= value [j+1] [i]) {
                    iff++;
                }
            }
        }
        if (iff > 0) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean piD(int N, int[][] value) {
        int iff = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N-1; j++) {
                if (value [i] [j] >= value [i] [j+1]) {
                    iff++;
                }
            }
        }
        if (iff > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean clock(int N, int[][] value) {
        int iff = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N-1; j++) {
                if (value [i] [j] >= value [i] [j+1]) {
                    iff++;
                }
            }
        }
        if (iff > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean original(int N, int[][] value) {
        int iff = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N-1; j++) {
                if (value [j] [i] <= value [j+1] [i]) {
                    iff++;
                }
            }
        }
        if (iff > 0) {
            return true;
        } else {
            return false;
        }
    }
}