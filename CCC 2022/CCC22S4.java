import java.io.*;

public class CCC22S4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);

        st.nextToken();
        long N = (long) st.nval;
        st.nextToken();
        long C = (long) st.nval;

        long[] circle = new long[(int) C];
        long[] sum = new long[(int) C];
        for (int i = 0; i < C; i++)
            circle[i] = 0;
        for (int i = 0; i < N; i++) {
            st.nextToken();
            long a = (long) st.nval;
            circle[(int) a]++;
        }

        sum[0] = circle[0];
        for (int i = 1; i < C; i++) {
            sum[i] = sum[i - 1] + circle[i];
        }

        long counter = (N * (N - 1) * (N - 2)) / 6;
        for (int i = 0; i < C; i++) {
            int opposite = (int) ((i + C / 2) % (int)C);
            long between;

            if (i < opposite) {
                between = sum[opposite] - sum[i];
            } else {
                between = sum[opposite] + sum[(int) (C - 1)] - sum[i];
            }

            counter -= (circle[i] * between * (between - 1)) / 2;
            counter -= (circle[i] * (circle[i] - 1) * between) / 2;
            counter -= (circle[i] * (circle[i] - 1) * (circle[i] - 2)) / 6;
        }

        if (C % 2 == 0) {
            for (int i = 0; i < C / 2; i++) {
                int opposite = (i + (int) (C / 2));
                counter += (circle[i] * (circle[i] - 1) * circle[opposite]) / 2;
                counter += (circle[i] * circle[opposite] * (circle[opposite] - 1)) / 2;
            }
        }

        System.out.println(counter);
    }
}