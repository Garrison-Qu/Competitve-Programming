import java.io.*;

public class CCC15S5 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);

        st.nextToken();
        int N = (int) st.nval;
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            st.nextToken();
            A[i] = (int) st.nval;
        }
        st.nextToken();
        int M = (int) st.nval;
        int[] B = new int[M];
        for (int i = 0; i < M; i++) {
            st.nextToken();
            B[i] = (int) st.nval;
        }
    }
}
