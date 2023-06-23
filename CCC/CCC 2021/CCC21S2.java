//15/15
import java.io.*;

public class CCC21S2 {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);

        st.nextToken();
        int row = (int) st.nval;
        st.nextToken();
        int col = (int) st.nval;

        int[] r = new int [row];
        int[] c = new int [col];

        st.nextToken();
        int N = (int) st.nval;

        int counter = 0;

        for (int i = 0; i < N; i++) {
            st.nextToken();
            String a = st.sval;
            st.nextToken();
            int q = (int) st.nval;
            if (a.charAt(0) == 'R') {
                r[q-1]++;
            } else {
                c[q-1]++;
            }
        }
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if ((r[i] + c[j]) % 2 == 1){
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}