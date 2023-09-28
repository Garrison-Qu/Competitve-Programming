import java.io.*;
import java.util.*;

public class CCC22S3V2 {
    static int[] piece;
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);

        st.nextToken();
        int N = (int) st.nval;
        st.nextToken();
        int M = (int) st.nval;
        st.nextToken();
        long K = (long) st.nval;
        piece = new int[N];
        Arrays.fill(piece, 1);

        K -= N;
        if (K < 0) {
            System.out.println("-1");
            return;
        }

        for(int i = 1; i < N && K > 0; i++){
            if(K >= Math.min(i, M - 1)){
                piece[i] = piece[i - 1] + 1;
                if(piece[i] > M)
                    piece[i] -= M;
                K -= Math.min(i, M - 1);
                if(K == 0){
                    for(int j = i + 1; j < N; j++ )
                        piece[j] = piece[i];
                }
            } else {
                piece[i] = piece[(int) (i - K - 1)];
                K -= K;
                for(int j = i + 1; j < N; j++) {
                    piece[j] = piece[i];
                }
            }
        }

        if (K > 0) {
            System.out.println("-1");
        } else {
            for (int i: piece) {
                System.out.print(i + " ");
            }
        }
    }
}
