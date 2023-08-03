import java.io.*;

public class CCC13S3 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);

        st.nextToken();
        //int fav = (int) st.nval;
        st.nextToken();
        int N = (int) st.nval;
        int[] points = new int[4];
        int[] save = new int[N];
        for (int i = 0; i < N; i++) {
            st.nextToken();
            int A = (int) st.nval;
            st.nextToken();
            int B = (int) st.nval;
            st.nextToken();
            int AP = (int) st.nval;
            st.nextToken();
            int BP = (int) st.nval;
            if (AP > BP) {
                points[A-1] += 3;
            } else if (BP > AP) {
                points[B-1] += 3;
            } else {
                points[A-1]++;
                points[B-1]++;
            }
            save[i] = A*10+B;
        }

        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                boolean saved = false;
                for (int q = 0; q < N; q++) {
                    if (save[q] == i*10+j) {
                        saved = true;
                    }
                }
                if (!saved) {
                    
                }
            }
        }
    }
}
