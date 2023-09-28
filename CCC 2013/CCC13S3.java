import java.io.*;
import java.util.*;

public class CCC13S3 {
    static int fav, favscore;
    static boolean[][] played = new boolean[4][4];
    static int[] points = new int[4];
    static ArrayList<String> permutation = new ArrayList<String>();
    static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);

        st.nextToken();
        fav = (int) st.nval - 1;
        st.nextToken();
        int N = (int) st.nval;
        for (int i = 0; i < N; i++) {
            st.nextToken();
            int A = (int) st.nval;
            st.nextToken();
            int B = (int) st.nval;
            st.nextToken();
            int AP = (int) st.nval;
            st.nextToken();
            int BP = (int) st.nval;
            if (AP > BP) {
                points[A - 1] += 3;
            } else if (BP > AP) {
                points[B - 1] += 3;
            } else {
                points[A - 1]++;
                points[B - 1]++;
            }
            played[A - 1][B - 1] = true;
        }

        for (int q = 0; q < 7290; q++) {
            simulate();
        }

        System.out.println(count);
    }

    private static void simulate() {
        int[] scores = new int[4];
        for (int i = 0; i < 4; i++) {
            scores[i] = points[i];
        }

        String code = "";
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                if (!played[i][j]) {
                    int random = (int) (Math.random() * 3);
                    if (random == 0) {
                        scores[i] += 3;
                        code += '0';
                    } else if (random == 1) {
                        scores[i]++;
                        scores[j]++;
                        code += '1';
                    } else {
                        scores[j] += 3;
                        code += '2';
                    }
                }
            }
        }
        favscore = scores[fav];
        Arrays.sort(scores);

        boolean contains = false;
        for (int i = 0; i < permutation.size(); i++) {
            if (code.equals(permutation.get(i))) {
                contains = true;
                break;
            }
        }
        if (!contains) {
            if (scores[3] == favscore && scores[3] != scores[2]) {
                count++;
            }
            permutation.add(code);
        }
    }
}
