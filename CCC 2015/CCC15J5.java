import java.io.*;

public class CCC15J5 {
    static int[][] outcome;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);
        st.nextToken();
        int n = (int) st.nval;
        st.nextToken();
        int k = (int) st.nval;

        outcome = new int[n+5][k+5];
        
        System.out.println(pi(n, k));
    }

    private static int pi (int n, int k) {
        if (outcome[n][k] != 0) {
            return outcome[n][k];
        }
        if (k == 1 || n == k) {
            return 1;
        } else if (n < k) {
            return 0;
        }
        outcome[n][k] = pi(n-k, k) + pi(n-1, k-1);
        return outcome[n][k];
    }
}