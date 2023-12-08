import java.io.*;
import java.util.*;

@SuppressWarnings("unchecked")
public class CCC15S4 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StreamTokenizer st = new StreamTokenizer(br);
    static int K, N, M, A, B;
    static ArrayList<Edge>[] adj;
    static int[][] dist;
    public static void main (String[] args) throws IOException {
        K = readInt();
        N = readInt();
        M = readInt();
        adj = new ArrayList[N+1];
        for (int i = 0; i <= N; i++) {
            adj[i] = new ArrayList<Edge>();
        }
        for (int i = 0; i < M; i++) {
            int a = readInt();
            int b = readInt();
            int t = readInt();
            int h = readInt();
            adj[a].add(new Edge(b, t, h));
            adj[b].add(new Edge(a, t, h));
        }
        A = readInt();
        B = readInt();
        
        dist = new int[N+1][K+1];
        for (int i = 0; i <= N; i++) Arrays.fill(dist[i], Integer.MAX_VALUE);
        dijkstra();

        int min = Integer.MAX_VALUE;
        for (int i: dist[B]) {
            min = Math.min(i, min);
        }

        System.out.println(min == Integer.MAX_VALUE ? -1: min);
    }

    public static void dijkstra () {
        PriorityQueue<Tuple> pq = new PriorityQueue<Tuple>();
        for (int i = 0; i <= K; i++) dist[A][i] = 0;
        pq.add(new Tuple(A, 0, K));
        
        while (!pq.isEmpty()) {
            Tuple t = pq.poll();
            for (int i = 0; i < adj[t.pos].size(); i++) {
                Edge e = adj[t.pos].get(i);
                if (t.ware <= e.hull) continue;
                if (dist[e.dest][t.ware-e.hull] > dist[t.pos][t.ware] + e.time) {
                    dist[e.dest][t.ware-e.hull] = dist[t.pos][t.ware] + e.time;
                    pq.add(new Tuple(e.dest, dist[e.dest][t.ware-e.hull], t.ware-e.hull));
                }
            }
        }
    }

    public static int readInt() throws IOException {
        st.nextToken();
        return (int) st.nval;
    }

    public static class Edge {
        int dest, time, hull;
        Edge (int dest, int time, int hull) {
            this.dest = dest;
            this.time = time;
            this.hull = hull;
        }
    }

    public static class Tuple implements Comparable<Tuple> {
        int pos, time, ware; 
        Tuple (int pos, int time, int ware) {
            this.pos = pos;
            this.time = time;
            this.ware = ware;
        }

        @Override public int compareTo(Tuple e) {
            return time-e.time;
        }
    }
}
