//15/15

import java.io.*;

public class CCC17J3V2 {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);
        st.nextToken();
        int a = (int) st.nval;
        st.nextToken();
        int b = (int) st.nval;
        st.nextToken();
        int c = (int) st.nval;
        st.nextToken();
        int d = (int) st.nval;
        st.nextToken();
        int t = (int) st.nval;

        int x = Math.abs((c-a));
        int y = Math.abs((d-b));
        if ((t - x - y) % 2 == 0 && x + y <= t) {
            System.out.println("Y");
        } else {
            System.out.println("N");
        }
    }
}