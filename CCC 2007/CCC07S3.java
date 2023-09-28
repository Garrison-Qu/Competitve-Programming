import java.io.*;
import java.util.*;

public class CCC07S3 {
    static ArrayList<Integer>[] adj = new ArrayList[10000];
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);

        st.nextToken();
        int N = (int) st.nval;
        for (int i = 0; i < 10000; i++) adj[i] = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            st.nextToken();
            int first = (int) st.nval;
            st.nextToken();
            int second = (int) st.nval;
            adj[first].add(second);
        }

        st.nextToken();
        int x = (int) st.nval;
        st.nextToken();
        int y = (int) st.nval;
        while (x != 0 && y != 0) {
            boolean[] visited = new boolean[10000];
            int[] count = new int[10000];
            int val = dfs(x, y, visited, count);
            if (val == -1) {
                System.out.println("no");
            } else {
                System.out.println("yes " + (val-1));
            }
            st.nextToken();
            x = (int) st.nval;
            st.nextToken();
            y = (int) st.nval;
        }
    }

    public static int dfs (int x, int y, boolean[] visited, int[] count) {
        if (x == y) {
            System.out.println(count[1] + " " + count[2] + " " + count[3]);
            return count[x];
        } else {
            count[y] = count[x] + 1;
        }

        if (visited[x]) {
            return -1;
        }
        visited[x] = true;

        int s;
        try {
            s = adj[x].size();
        } catch (Exception e) {
            s = 0;
        }
        for (int j = 0; j < s; j++) {
            int c = dfs(adj[x].get(j), y, visited, count);
            if (c != -1) {
                return count[y];
            } else {
                return -1;
            }
        }
        return -1;
    }
}
