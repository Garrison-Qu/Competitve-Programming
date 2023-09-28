import java.io.*;
import java.util.*;

public class CCC09S4V3 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);
        st.nextToken();
        int N = (int) st.nval;
        int[][] graph = new int[N+1][N+1];
        st.nextToken();
        int T = (int) st.nval;
        for (int i = 0; i <= N; i++) {
            Arrays.fill(graph[i], Integer.MAX_VALUE/2);
        } 
        for (int i = 0; i < T; i++) {
            st.nextToken();
            int x = (int) st.nval;
            st.nextToken();
            int y = (int) st.nval;
            st.nextToken();
            int w = (int) st.nval;
            graph[x][y] = w;
            graph[y][x] = w;
        }
        st.nextToken();
        int K = (int) st.nval;
        int[] cost = new int[N+1];
        Arrays.fill(cost, -1);
        for (int i = 0; i < K; i++) {
            st.nextToken();
            int v = (int) st.nval;
            st.nextToken();
            int c = (int) st.nval;
            cost[v] = c;
        }
        st.nextToken();
        int D = (int) st.nval;
        int[] dist = new int[N+1];
        boolean[] visited = new boolean[N+1];
        Arrays.fill(dist, Integer.MAX_VALUE/2);
        dist[D] = 0;
        for (int i = 1; i <= N; i++) {
            int min = Integer.MAX_VALUE;
            int u = -1;
            for (int a = 1; a <= N; a++) {
                if(!visited[a] && dist[a] < min) {
                    min = dist[a];
                    u = a;
                }
            }
            if (u == -1) break;
            visited[u] = true;
            for (int v = 1; v <= N; v++) {
                if (dist[v] > dist[u] + graph[u][v]) {
                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }
        int sol = Integer.MAX_VALUE;
        for (int i = 1; i <= N; i++) {
            if (cost[i] != -1) {
                sol = Math.min(sol, dist[i] + cost[i]);
            }
        }
        System.out.println(sol);
    }
}
