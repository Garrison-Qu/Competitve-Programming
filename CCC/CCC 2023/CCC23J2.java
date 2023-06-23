//15/15

import java.io.*;

public class CCC23J2 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);

        st.nextToken();
        int N = (int) st.nval;
        int counter = 0;
        for (int i = 0; i < N; i++) {
            st.nextToken();
            String input = st.sval;
            if (input.charAt(0) == 'P'){
                counter += 1500;
            } else if (input.charAt(0) == 'M'){
                counter += 6000;
            } else if (input.charAt(0) == 'S'){
                counter += 15500;
            } else if (input.charAt(0) == 'C'){
                counter += 40000;
            } else if (input.charAt(0) == 'T'){
                counter += 75000;
            } else if (input.charAt(0) == 'H'){
                counter += 125000;
            }
        }
        System.out.println(counter);
    }
}
