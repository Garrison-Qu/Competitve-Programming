import java.io.*;
import java.util.*;

public class CCC09S2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StreamTokenizer st = new StreamTokenizer(br);

    public static void main(String[] args) throws IOException {
        st.nextToken();
        int R = (int) st.nval;
        st.nextToken();
        int L = (int) st.nval;
        String[] lights = new String[R];
        Set<String> saved = new HashSet<>();

        for (int i = 0; i < R; i++) {
            lights[i] = readLine().replaceAll(" ", "");
        }

        for (int i = 0; i < R; i++) {
            String res = lights[i];
            for (int j = i + 1; j < R; j++) {
                res = push(res, lights[j]);
            }
            saved.add(res);
        }

        System.out.println(saved.size());
    }

    public static String push(String a, String b) {
        String res = "";
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b.charAt(i)) {
                res += '0';
            } else {
                res += '1';
            }
        }
        return res;
    }

    static String readLine() throws IOException {
        return br.readLine().trim();
    }
}
