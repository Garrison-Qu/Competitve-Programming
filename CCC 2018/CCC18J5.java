import java.io.*;
import java.util.*;

public class CCC18J5 {
    static public void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);

        st.nextToken();
        int N = (int) st.nval;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int count = Integer.MAX_VALUE;
        HashSet<Integer> end = new HashSet<>();
        boolean reachable = true;
        for (int i = 0; i <= N; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 1; i <= N; i++) {
            st.nextToken();
            int M = (int) st.nval;

            if (M == 0) {
                end.add(i);
            }

            for (int j = 0; j < M; j++) {
                st.nextToken();
                adj.get(i).add((int) st.nval);
            }
        }

        PriorityQueue<Integer> q = new PriorityQueue<>();
        int[] dist = new int[N + 5];
        boolean[] visited = new boolean[N + 5];

        q.add(1);
        dist[1] = 1;

        while (!q.isEmpty()) {
            int current = q.poll();

            visited[current] = true;
            for (int i = 0; i < adj.get(current).size(); i++) {
                if (dist[current] + 1 < dist[adj.get(current).get(i)] || dist[adj.get(current).get(i)] == 0) {
                    q.add(adj.get(current).get(i));
                    dist[adj.get(current).get(i)] = dist[current] + 1;
                }
            }

            for (int i = 1; i <= N; i++) {
                if (dist[i] < count && end.contains(i) && dist[i] != 0) {
                    count = dist[i];
                }

                if (dist[i] == 0) {
                    reachable = false;
                }
            }
        }
        if (!reachable) {
                System.out.println("N");
            } else {
                System.out.println("Y");
            }

            System.out.println(count);
    }
}
