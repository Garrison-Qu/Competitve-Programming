import java.io.*;

public class CCC11S3 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);

        st.nextToken();
        int T = (int) st.nval;
        for (int i = 0; i < T; i++) {
            st.nextToken();
            int m = (int) st.nval;
            st.nextToken();
            int x = (int) st.nval;
            st.nextToken();
            int y = (int) st.nval;
            if (solve(m, x, y)) {
                System.out.println("crystal");
            } else {
                System.out.println("empty");
            }
        }
    }

    private static boolean solve(int m, int x, int y){
        int xl = (int) (x / Math.pow(5, m - 1));
        int yl = (int) (y / Math.pow(5, m - 1));
        if (xl == 0) {
            return false;
        }

        if (xl > 0 && xl < 4 && yl == 0) {
            return true;
        }

        if (xl == 2 && yl == 1) {
            return true;
        } 

        if (((xl == 1 || xl == 3) && yl == 1) || (xl == 2 && yl == 2)) {
            return solve(m - 1, x % (int) Math.pow(5, m - 1), y % (int) Math.pow(5, m - 1));
        }

        return false;
    }
}
