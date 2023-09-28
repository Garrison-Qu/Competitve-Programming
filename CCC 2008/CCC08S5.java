import java.io.*;

public class CCC08S5 {
    static int[][][][] dp = new int[31][31][31][31];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);

        st.nextToken();
        int N = (int) st.nval;
        for (int i = 0; i < N; i++) {
            st.nextToken();
            int A = (int) st.nval;
            st.nextToken();
            int B = (int) st.nval;
            st.nextToken();
            int C = (int) st.nval;
            st.nextToken();
            int D = (int) st.nval;
            if (win(A, B, C, D)) System.out.println("Patrick");
            else System.out.println("Roland");
        }
    }

    public static boolean win(int A, int B, int C, int D) {
        if (dp[A][B][C][D] != 0) {
            return dp[A][B][C][D] == 2;
        }

        if (!move(A, B, C, D)) {
            dp[A][B][C][D] = 1;
            return false;
        }

        if (A >= 2 && B >= 1 && D >= 2) {
            if (!win(A - 2, B - 1, C, D - 2)) {
                dp[A][B][C][D] = 2;
                return true;
            }
        }

        if (A >= 1 && B >= 1 && C >= 1 && D >= 1) {
            if (!win(A - 1, B - 1, C - 1, D - 1)) {
                dp[A][B][C][D] = 2;
                return true;
            }
        }

        if (C >= 2 && D >= 1) {
            if (!win(A, B, C - 2, D - 1)) {
                dp[A][B][C][D] = 2;
                return true;
            }
        }

        if (B >= 3) {
            if (!win(A, B - 3, C, D)) {
                dp[A][B][C][D] = 2;
                return true;
            }
        }

        if (A >= 1 && D >= 1) {
            if (!win(A - 1, B, C, D - 1)) {
                dp[A][B][C][D] = 2;
                return true;
            }
        }

        dp[A][B][C][D] = 1;
        return false;
    }

    public static boolean move(int A, int B, int C, int D) {
        if (A >= 2 && B >= 1 && D >= 2)
            return true;
        if (A >= 1 && B >= 1 && C >= 1 && D >= 1)
            return true;
        if (C >= 2 && D >= 1)
            return true;
        if (B >= 3)
            return true;
        if (A >= 1 && D >= 1)
            return true;
        return false;
    }
}
