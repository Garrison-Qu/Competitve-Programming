import java.io.*;
//import java.util.*;

public class CCC15J4 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);

        st.nextToken();
        int N = (int) st.nval;

        //ArrayList<Integer> info = new ArrayList<Integer>();

        char[] c = new char[N];
        int[] s = new int[N];

        for (int i = 0; i < N; i++) {
            st.nextToken();
            c[i] = st.sval.charAt(0);
            st.nextToken();
            s[i] = (int) st.nval;
        }

        //for (int i = 0)
    }
}
