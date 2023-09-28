import java.io.*;

public class CCC11J5 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);

        st.nextToken();
        int N = (int) st.nval;
        int[] invite = new int[] {1,1,1,1,1,1,1};
        for (int i = 0; i < N-1; i++) {
            st.nextToken();
            int inviteby = (int) st.nval;
            invite[inviteby] = invite[inviteby]*(1+invite[i+1]);
        }
        System.out.println(invite[N]);
    }
}
    