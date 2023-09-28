import java.io.*;

public class CCC15S2 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);

        st.nextToken();
        int J = (int) st.nval;
        st.nextToken();
        int A = (int) st.nval;

        int[] jersey = new int [J];
        for (int i = 0; i < J; i++) {
            st.nextToken();
            char c = st.sval.charAt(0);
            if (c == 'S') {
                jersey[i] = 0;
            } else if (c == 'M') {
                jersey[i] = 1;
            } else if (c == 'L') {
                jersey[i] = 2;
            }
        }

        int counter = 0;

        for (int i = 0; i < A; i++) {
            st.nextToken();
            char c = st.sval.charAt(0);
            st.nextToken();
            int a = (int) st.nval;
            int d = -5;
            if (c == 'S') {
                d = 0;
            } else if (c == 'M') {
                d = 1;
            } else if (c == 'L') {
                d = 2;
            }

            if (jersey[a-1] >= d) {
                counter++;
                jersey[a-1] = -1;
            }
            
        }

        System.out.println(counter);
    }
}
