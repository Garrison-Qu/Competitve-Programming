import java.io.*;

public class CCC23S1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);

        st.nextToken();
        int n = (int) st.nval;
        int[][] idx = new int[2][n + 5];
        int count = 0;
        for (int i = 1; i <= n; i++) {
            st.nextToken();
            idx[0][i] = (int) st.nval;
        }

        for (int i = 1; i <= n; i++) {
            st.nextToken();
            idx[1][i] = (int) st.nval;
        }

        for (int i = 1; i <= n; i++) {
            if (idx[0][i] == 1) {
                count += 3;
                if (idx[0][i-1] == 1) {
                    count--;
                }
                if (idx[0][i+1] == 1) {
                    count--;
                }
                if (idx[1][i] == 1 && i % 2 == 1) {
                    count--;
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            if (idx[1][i] == 1) {
                count += 3;
                if (idx[1][i-1] == 1) {
                    count--;
                }
                if (idx[1][i+1] == 1) {
                    count--;
                }
                if (idx[0][i] == 1 && i % 2 == 1) {
                    count--;
                }
            }
        }

        System.out.println(count);
    }
}
