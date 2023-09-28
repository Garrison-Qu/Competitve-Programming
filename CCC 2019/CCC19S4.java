import java.io.*;
import java.util.*;

public class CCC19S4 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);

        st.nextToken();
        int N = (int) st.nval;
        st.nextToken();
        int K = (int) st.nval;

        int[] a = new int[N + 5];

        for (int i = 0; i < N; i++) {
            st.nextToken();
            a[i] = (int) st.nval;
        }
    }
}
