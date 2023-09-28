import java.io.*;

public class CCC13S5 {
    static int out = Integer.MAX_VALUE;
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);
        st.nextToken();
        int N = (int) st.nval;
        dfs(N, 0);
        System.out.println(out);
    }

    public static void dfs (int n, int cost) {
        if (n < 0 || cost > out) {
            return;
        }

        if (n == 1) {
            out = Math.min(cost, out);
            return;
        }

        for (int i = (int) n/2; i >= 1; i--) {
            int c = n - i;
            if (c % i == 0) {
                dfs(n - i, cost + (c / i));
                break;
            }
        }
    }
}