import java.io.*;
import java.util.*;

public class CCC07S4 {
    static ArrayList<Integer>[] paths;
    static int dp[];
    static int N;
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);

        st.nextToken();
        N = (int) st.nval;
        paths = new ArrayList[N+1];
        dp = new int[N+1];
        for (int i = 1; i <= N; i++) {
            paths[i] = new ArrayList<Integer>();
        }
        while (true) {
            st.nextToken();
            int a = (int) st.nval;
            st.nextToken();
            int b = (int) st.nval;
            if (a == 0 && b == 0) {
                break;
            }
            paths[a].add(b);
        }
        dfs(1);
        System.out.println(dp[1]);
    }

    public static void dfs(int i) {
        for (int j : paths[i]) {
            if (j == N) {
                dp[i] += 1;
            } 
            else if (dp[j]!=0) {
                dp[i]+=dp[j];
            } 
            else {
                dfs(j);
                dp[i]+=dp[j];
            }
        }
    }
}
