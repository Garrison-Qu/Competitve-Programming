import java.io.*;

public class CCC07S5 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);
        st.nextToken();
        int T = (int) st.nval;
        for (int t = 0; t < T; t++) {
            st.nextToken();
            int N = (int) st.nval;
            st.nextToken();
            int K = (int) st.nval;
            st.nextToken();
            int W = (int) st.nval;
            int[] pins = new int[N+1];
            for (int i = 1; i <= N; i++) {
                st.nextToken();
                pins[i] = (int) st.nval;
            }
            int[] stacks = new int[N+1];
            for (int i = 1; i <= N-W+1; i++) {
                for (int j = i; j < i+W; j++) {
                    stacks[i] += pins[j];
                }
            }
            int[][] dp = new int[K+1][N+1];
            for (int i = 0; i < N+1; i++) {
                dp[0][i] = 0;
            }
            for (int i = 1; i < K+1; i++) {
                for (int j = 1; j < N+1; j++) {
                    dp[i][j] = -1;
                }
            }
            for (int i = 1; i <= K; i++) {
                for (int j = N; j >= 1; j--) {
                    if (j >= N-W+1){
                        dp[i][j] = stacks[j];
                    }
                    else {
                        dp[i][j] = Math.max(dp[i-1][j+W] + stacks[j], dp[i][j+1]);
                    }
                }
            }
            System.out.println(dp[K][1]);
        }
    }
}