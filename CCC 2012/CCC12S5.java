import java.io.*;

public class CCC12S5 {
    public static boolean[][] cat = new boolean[25 + 5][25 + 5];
    public static int[][] count = new int[25 + 5][25 + 5];
    public static int row, col;
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);

        st.nextToken();
        row = (int) st.nval;
        st.nextToken();
        col = (int) st.nval;

        st.nextToken();
        int n = (int) st.nval;
        for (int i = 0; i < n; i++) {
            st.nextToken();
            int r = (int) st.nval;
            st.nextToken();
            int c = (int) st.nval;
            cat[r][c] = true;
        }
        if (!cat[row-1][col]) {
            count[row-1][col] = 1;
        }
        if (!cat[row][col-1]) {
            count[row][col-1] = 1;
        }
        System.out.println(calculatePaths(1, 1));
    }

    private static int calculatePaths (int r, int c) {
        if (count[r][c] != 0) {
            return count[r][c];
        }
        if (r > row || c > col) {
            return 0;
        }

        if(!cat[r][c]) {
            count[r][c] = calculatePaths(r+1, c) + calculatePaths(r, c+1);
        } else {
            count[r][c] = 0;
        }

        return count[r][c];
    }
}