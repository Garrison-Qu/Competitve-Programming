//15/15
import java.io.*;

public class CCC17S1 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StreamTokenizer st = new StreamTokenizer(br);

    
    public static void main (String[] args) throws IOException {
        st.nextToken();
        int input = (int) st.nval;
        int at = 0;
        int bt = 0;
        int [] A = new int [input + 1];
        int [] B = new int [input + 1];
        boolean output = false;
        
        for (int i = 0; i < input; i++) {
            st.nextToken();
            A[i] = (int) st.nval;
        }
        for (int i = 0; i < input; i++) {
            st.nextToken();
            B[i] = (int) st.nval;
        }
        for (int j = 0; j <= input - 1; j++) {
            at += A[j]; 
            bt += B[j];
        }
        for (int i = input; i >= 0; i--) {
            at -= A[i];
            bt -= B[i];
            if (at == bt) {
                System.out.println(i);
                output = true;
                break;
            }
        }

        if (output == false) {
            System.out.println("0");
        }
    }
}
