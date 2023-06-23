import java.io.*;

public class CCC23S1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);

        st.nextToken();
        int input = (int) st.nval;
        int[][] idx = new int[input][2];
        int res = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < input; j++) {
                st.nextToken();
                idx[j][i] = (int) st.nval;
                if (idx [j] [i] == 1) {
                    res += 3;
                }
            }
        }

        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < input - 1; i++) {
                if (1 == idx[i] [j] && idx[i][j] == idx[i + 1][j]) {
                    res -= 2;
                }
            }
        }

        for (int i = 0; i < (int) input/2; i++) {
            if (1 == idx[i*2] [0] && idx [i*2] [0] == idx [i*2] [1]) {
                res -= 2;
            }
        }

        System.out.println(res);
    }
}
