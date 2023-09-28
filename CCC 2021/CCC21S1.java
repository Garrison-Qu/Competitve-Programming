//15/15
import java.io.*;

public class CCC21S1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);

        st.nextToken();
        int N = (int) st.nval;

        int[] height = new int[N+1];
        int[] width = new int[N];

        double output = 0;

        for (int i = 0; i < (N+1); i++) {
            st.nextToken();
            height[i] = (int) st.nval;
        }

        for (int i = 0; i < N; i++) {
            st.nextToken();
            width[i] = (int) st.nval;
        }

        for (int i = 0; i < N; i++) {
            output += ((double) height[i] + (double) height[i+1]) * (double) width[i] /2;
        }

        System.out.println(output);
    }
}