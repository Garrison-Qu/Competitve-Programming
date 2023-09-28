import java.io.*;
import java.util.*;

public class CCC09S4V2 {
    static ArrayList<ArrayList<Edge>> graph = new ArrayList<ArrayList<Edge>>();
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);
        st.nextToken();
        int N = (int) st.nval;
        st.nextToken();
        int T = (int) st.nval;
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < T; i++) {
            st.nextToken();
            int x = (int) st.nval;
            st.nextToken();
            int y = (int) st.nval;
            st.nextToken();
            int w = (int) st.nval;
            graph.get(x).add(new Edge(y, w));
            graph.get(y).add(new Edge(x, w));
        }
        st.nextToken();
        int K = (int) st.nval;
        int[] cost = new int[N+1];
        ArrayList<Integer> dest = new ArrayList<Integer>();
        Arrays.fill(cost, -1);
        for (int i = 0; i < K; i++) {
            st.nextToken();
            int v = (int) st.nval;
            dest.add(v);
            st.nextToken();
            int c = (int) st.nval;
            cost[v] = c;
        }
        st.nextToken();
        int D = (int) st.nval;
        
        PriorityQueue<Pair> queue = new PriorityQueue<Pair>(Collections.reverseOrder());
        int[] dist = new int[N+1];
        boolean[] visited = new boolean[N+1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[D] = 0;
        queue.add(new Pair(0, D));

        while (!queue.isEmpty()) {
            int a = queue.poll().pos;
            if (visited[a]) continue;
            visited[a] = true;
            for (int i = 0; i < graph.get(a).size(); i++) {
                int b = graph.get(a).get(i).second;
                int weight = graph.get(a).get(i).weight;
                if (dist[a]+weight < dist[b]) {
                    dist[b] = dist[a]+weight;
                    queue.add(new Pair(dist[b], b));
                }
            }
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= N; i++) {
            if (visited[i] && cost[i] != -1) {
                if (min > cost[i] + dist[i]) {
                    min = cost[i] + dist[i];
                }
            }
        }

        System.out.println(min);
    }

    public static class Edge implements Comparable<Edge>{
        int second, weight;
            
        public Edge (int second, int weight) {
            this.second = second;
            this.weight = weight; 
        }
        @Override public int compareTo(Edge e) {
            return weight-e.weight;
        }
    }

    public static class Pair implements Comparable<Pair>{
        int dis, pos;
            
        public Pair (int d, int pos) {
            this.dis = d;
            this.pos = pos;
        }
    
        @Override public int compareTo(Pair p) {
            return dis - p.dis;
        }
    }    
}