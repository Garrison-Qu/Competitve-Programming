import java.io.*;

public class CCC21S4 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);

        st.nextToken();
        int N = (int) st.nval;
        st.nextToken();
        int W = (int) st.nval;
        st.nextToken();
        int D = (int) st.nval;

        int[][] E = new int[N][N];

        for (int i = 0; i < W; i++) {
            st.nextToken();
            int A = (int) st.nval;
            st.nextToken();
            int B = (int) st.nval;
            E[A][B] = (int) st.nval;
        }
    }
}
