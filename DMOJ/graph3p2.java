import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class graph3p2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);
        st.nextToken();
        int N = (int) st.nval;
        st.nextToken();
        int M = (int) st.nval;
        ArrayList<Edge> graph = new ArrayList<Edge>();
        for (int i = 0; i < M; i++) {
            st.nextToken();
            int a = (int) st.nval;
            st.nextToken();
            int b = (int) st.nval;
            st.nextToken();
            int v = (int) st.nval;
            graph.add(new Edge(a, b, v));
        }

        int[] dist = new int[N + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[1] = 0;
        for (int i = 1; i < N; i++) {
            for (int j = 0; j < M; j++) {
                Edge e = graph.get(j);
                int u = e.first;
                int v = e.second;
                int w = e.weight;
                if (dist[u] != Integer.MAX_VALUE && dist[u] + w < dist[v]) {
                    dist[v] = dist[u] + w;
                }
            }
        }
        System.out.println(dist[N]);
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
