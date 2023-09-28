import java.io.*;

public class CCC16S3 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);

        int[] targets = new int[(int) 10e5];

        st.nextToken();
        //int N = (int) st.nval;
        st.nextToken();
        int M = (int) st.nval;
        for (int i = 0; i < M; i++) {
            st.nextToken();
            targets[i] = (int) st.nval;
        }
    }
}