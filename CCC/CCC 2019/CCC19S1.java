//15/15

import java.io.*;

public class CCC19S1 {
    static int[] i = new int[4];
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);

        i[0] = 1;
        i[1] = 2;
        i[2] = 3;
        i[3] = 4;
        
        String output; 
        st.nextToken();
        output = st.sval;
        
        for (int j = 0; j < output.length(); j++) {
            if (output.charAt(j) == 'H') {
                HFlip();
            } else if (output.charAt(j) == 'V') {
                VFlip();
            }
        }

        System.out.println(i[0] + " " + i[1]);
        System.out.println(i[2] + " " + i[3]);
    }

    public static void HFlip() {
        int alt = i[0];
        i[0] = i[2];
        i[2] = alt;
        alt = i[1];
        i[1] = i[3];
        i[3] = alt;
    }
    
    public static void VFlip() {
        int alt = i[0];
        i[0] = i[1];
        i[1] = alt;
        alt = i[2];
        i[2] = i[3];
        i[3] = alt;
    }
}