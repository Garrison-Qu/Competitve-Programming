import java.io.*;
import java.util.*;

public class CCC00S4 {
    static int[] dist;
    static boolean[] calc;
    static int[] val;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);

        st.nextToken();
        int target = (int) st.nval;
        st.nextToken();
        int n = (int) st.nval;
        dist = new int[n + 5];
        val = new int[target + 5];
        Arrays.fill(val, Integer.MAX_VALUE);
        for (int i = 0; i < n; i++) {
            st.nextToken();
            dist[i] = (int) st.nval;
            val[dist[i]] = 1;
        }

        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= target; j++) {
                if (!(j-dist[i]<0) && val[j-dist[i]] != Integer.MAX_VALUE){
                    val[j] = Math.min(val[j], val[j-dist[i]] + 1);
                }
            }
        }

        if (val[target] == Integer.MAX_VALUE) System.out.println("Roberta acknowledges defeat.");
        else System.out.println("Roberta wins in " + val[target] + " strokes.");
    }
}
