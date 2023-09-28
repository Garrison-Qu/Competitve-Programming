import java.io.*;

public class CCC11S5 {
    static int K;
    static boolean[] light;
    static int count = Integer.MAX_VALUE;
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);

        st.nextToken();
        K = (int) st.nval;
        light = new boolean[K];
        for (int i = 0; i < K; i++) {
            st.nextToken();
            if ((int) st.nval == 1) {
                light[i] = true;
            } else {
                light[i] = false;
            }
        }

        for (int i = 0; i < K; i++) {
            if (!light[i]) {
                dfs(i, light, 0);
            }
        }
    }

    public static void dfs (int i, boolean[] map, int c) {
        map[i] = true;
        int pos = i;
        int consecutive = 1;
        while (pos > 0) {
            if (!map[pos]) {
                break;
            }
            pos--;
        }
        while (pos < K) {
            if (map[pos]) {
                consecutive++;
            } else {
                break;
            }
            pos++;
        }
        if (consecutive >= 4) {
            for (int j = 0; j < consecutive-1; j++) {
                map[pos-j-1] = false;
            }
        }
        boolean done = true;
        for (int j = 0; j < K; j++) {
            if (!light[j]) {
                dfs(j, map, c++);
                done = false;
            }
        }
        if (done) {
            if (c < count) {
                count = c;
            }
        }
    }
}