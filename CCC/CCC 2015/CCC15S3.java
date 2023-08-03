import java.io.*;

public class CCC15S3 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);

        st.nextToken();
        int G = (int) st.nval;
        st.nextToken();
        int P = (int) st.nval;

        boolean[] docked = new boolean[G];
        int count = 0;

        boolean ctn;
        
        for (int i = 0; i < P; i++) {
            ctn = true;

            st.nextToken();
            int g = ((int) st.nval) - 1;
            for (int j = g; j >= 0; j--) {
                if (docked[j] == false) {
                    docked[j] = true;
                    count++;
                    break;
                } else if (j == 0) {
                    ctn = false;
                }
            }
            if (!ctn) {
                break;
            }
        }

        System.out.println(count);
    }
}
