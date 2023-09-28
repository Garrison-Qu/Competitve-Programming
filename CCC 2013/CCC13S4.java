import java.io.*;
import java.util.*;

public class CCC13S4 {
    static ArrayList<Integer>[] adj;
    static boolean[] visited;
    static int c1, c2;
    static int output = 0;
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);
        
        st.nextToken();
        int N = (int) st.nval;
        st.nextToken();
        int M = (int) st.nval;
        adj = new ArrayList[N+1];
        visited = new boolean[N+1];
        for (int i = 0; i <= N; i++) {
            adj[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < M; i++) {
            st.nextToken();
            int taller = (int) st.nval;
            st.nextToken();
            int shorter = (int) st.nval;
            adj[taller].add(shorter);
        }
        st.nextToken();
        c1 = (int) st.nval;
        st.nextToken();
        c2 = (int) st.nval;

        dfs(c1, 0);
        Arrays.fill(visited, false);
        dfs(c2, 0);
        if (output == 1) {
            System.out.println("yes");
        } else if (output == 2) {
            System.out.println("no");
        } else {
            System.out.println("unknown");
        }
    }

    public static void dfs (int i, int t) {
        if (i == c1 && t != 0) {
            output = 2;
            return;
        }
        if (i == c2 && t != 0) {
            output = 1;
            return;
        }
        if (visited[i]) return;

        int s;
        try {
            s = adj[i].size();
        } catch (Exception e) {
            s = 0;
        }
        for (int j = 0; j < s; j++) {
            dfs(adj[i].get(j), 1);
        }
        visited[i] = true;
    }
}
