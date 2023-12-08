import java.io.*;
import java.util.*;

public class CCO15P2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);

        st.nextToken();
        int N = (int) st.nval;
        st.nextToken();
        int M = (int) st.nval;

        ArrayList<ArrayList<Edge>> edge = new ArrayList<ArrayList<Edge>>();
        for (int i = 0; i < N; i++) {
            edge.add(new ArrayList<Edge>());
        }

        for (int i = 0; i < M; i++) {
            st.nextToken();
            int s = (int) st.nval;
            st.nextToken();
            int d = (int) st.nval;
            st.nextToken();
            int l = (int) st.nval;
            edge.get(s).add(new Edge(d, l));
        }

        int[][] dp = new int[N][1 << N];

        LinkedList<Pair> q = new LinkedList<Pair>();
        dp[0][1] = 0;
        q.add(new Pair(0, 1));

        while (!q.isEmpty()) {
            Pair p = q.poll();

            for (Edge e : edge.get(p.u)) {
                if ((p.bitmask & (1 << e.v)) == 0) {
                    int newMask = p.bitmask | (1 << e.v);
                    if (dp[e.v][newMask] < dp[p.u][p.bitmask] + e.weight) {
                        dp[e.v][newMask] = dp[p.u][p.bitmask] + e.weight;
                        q.add(new Pair(e.v, newMask));
                    }
                }
            }
        }

        int count = 0;
        for (int i = 1; i < (1 << N); i++) {
            count = Math.max(count, dp[N - 1][i]);
        }

        System.out.println(count);
    }

    public static class Edge {
        int v, weight;

        public Edge(int v, int weight) {
            this.v = v;
            this.weight = weight;
        }
    }

    public static class Pair {
        int u, bitmask;

        public Pair(int u, int bitmask) {
            this.u = u;
            this.bitmask = bitmask;
        }
    }
}
