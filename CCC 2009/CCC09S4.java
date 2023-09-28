import java.io.*;
import java.util.*;

public class CCC09S4 {
    static ArrayList<Edge> graph = new ArrayList<Edge>();
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);
        st.nextToken();
        int N = (int) st.nval;
        st.nextToken();
        int T = (int) st.nval;
        for (int i = 0; i < T; i++) {
            st.nextToken();
            int x = (int) st.nval;
            st.nextToken();
            int y = (int) st.nval;
            st.nextToken();
            int w = (int) st.nval;
            graph.add(new Edge(x, y, w));
            graph.add(new Edge(y, x, w));
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
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[D] = 0;

        for (int i = 1; i < N; i++) {
            for (int j = 0; j < 2*T; j++) {
                Edge e = graph.get(j);
                int u = e.first;
                int v = e.second;
                int w = e.weight;
                if (dist[u] != Integer.MAX_VALUE && dist[u] + w < dist[v]) {
                    dist[v] = dist[u] + w;
                }
            }
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= N; i++) {
            if (cost[i] != -1) {
                if (min > cost[i] + dist[i]) {
                    min = cost[i] + dist[i];
                }
            }
        }
        /*
        System.out.println();
        for (int i = 0; i <= N; i++) {
            if (cost[i] != -1) {
                System.out.println(i + " " + (dist[i] + cost[i]));
            }
        }*/
        System.out.println(min);
    }

    public static class Edge implements Comparable<Edge>{
        int first, second, weight;
            
        public Edge (int first, int second, int weight) {
            this.first = first;
            this.second = second;
            this.weight = weight; 
        }
        @Override public int compareTo(Edge e) {
            return weight-e.weight;
        }
    }
}