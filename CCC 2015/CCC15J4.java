import java.io.*;
import java.util.*;

public class CCC15J4 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);

        st.nextToken();
        int N = (int) st.nval;

        int[] received = new int[100 + 5];
        Arrays.fill(received, -1);
        int[] sent = new int[100 + 5];
        Arrays.fill(sent, -1);
        int[] count1 = new int[100 + 5];
        int[] count2 = new int[100 + 5];

        int t = 0;

        for (int i = 0; i < N; i++) {
            st.nextToken();
            char c = st.sval.charAt(0);
            st.nextToken();
            int n = (int) st.nval;
            if (c == 'R') {
                count1[n]++;
                if (received[n] == -1) {
                    received[n] = 0;
                }
                received[n] += t;
                t++;
            } else if (c == 'S') {
                count2[n]++;
                if (sent[n] == -1) {
                    sent[n] = 0;
                }
                sent[n] += t;
                t++;
            } else if (c == 'W') {
                t += n-1;
            }
        }

        for (int i = 0; i < received.length; i++) {
            if (received[i] != -1) {
                if (count1[i] == count2[i]) {
                    //System.out.println(i + " " + sent[i] + " " + received[i]);
                    System.out.println(i + " " + (int) (sent[i]-received[i]));
                } else {
                    System.out.println(i + " -1");
                }
            }
        }
    }
}
