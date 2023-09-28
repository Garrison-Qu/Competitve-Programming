import java.util.*;
import java.io.*;

public class CCC22S2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);

        int count = 0;

        st.nextToken();
        int x = (int) st.nval;
        HashMap<String, String> X = new HashMap<String, String>();
        for (int i = 0; i < x; i++) {
            st.nextToken();
            String p1 = st.sval;
            st.nextToken();
            String p2 = st.sval;
            X.put(p1, p2);
        }

        st.nextToken();
        int y = (int) st.nval;
        HashMap<String, String> Y = new HashMap<String, String>();
        for (int i = 0; i < y; i++) {
            st.nextToken();
            String p1 = st.sval;
            st.nextToken();
            String p2 = st.sval;
            Y.put(p1, p2);
        }

        st.nextToken();
        int G = (int) st.nval;
        for (int i = 0; i < G; i++) {
            String[] group = new String[3];
            for (int j = 0; j < 3; j++) {
                st.nextToken();
                group[j] = st.sval;
            }

            while (X.get(group[0]) != null) {
                if (!X.get(group[0]).equals(group[1]) && !X.get(group[0]).equals(group[2])) {
                    count++;
                }
                X.remove(group[0]);
            }
            if (X.get(group[1]) != null) {
                if (!X.get(group[1]).equals(group[0]) && !X.get(group[1]).equals(group[2])) {
                    count++;
                }
                X.remove(group[1]);
            }
            if (X.get(group[2]) != null) {
                if (!X.get(group[2]).equals(group[0]) && !X.get(group[2]).equals(group[1])) {
                    count++;
                }
                X.remove(group[2]);
            }

            while (Y.get(group[0]) != null) {
                if (Y.get(group[0]).equals(group[1]) || Y.get(group[0]).equals(group[2])) {
                    count++;
                }
                Y.remove(group[0]);
            }
            while (Y.get(group[1]) != null) {
                if (Y.get(group[1]).equals(group[0]) || Y.get(group[1]).equals(group[2])) {
                    count++;
                }
                Y.remove(group[1]);
            }
            while (Y.get(group[2]) != null) {
                if (Y.get(group[2]).equals(group[0]) || Y.get(group[2]).equals(group[1])) {
                    count++;
                }
                Y.remove(group[2]);
            }
        }

        System.out.println(count);
    }
}