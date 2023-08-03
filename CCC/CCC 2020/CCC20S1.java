import java.io.*;
import java.util.*;

public class CCC20S1 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);

        st.nextToken();
        int N = (int) st.nval;
        
        ArrayList<info> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            st.nextToken();
            int t = (int) st.nval;
            st.nextToken();
            int d = (int) st.nval;
            list.add(new info(t, d));
        }
        Collections.sort(list);
        double counter = -5;

        for (int i = 0; i < N-1; i++) {
            info prev = list.get(i);
            info next = list.get(i+1);
            double a = Math.abs((double) (prev.D - next.D) / (prev.T-next.T));
            if (a > counter) {
                counter = a;
            }
        }
        
        System.out.println(counter);
    }

    static class info implements Comparable<info>{
        int T, D;
        info(int time, int dis) {
            T = time; D = dis;
        }

        @Override
        public int compareTo(info o) {
            return T-o.T;
        }
    }
}
