import java.io.*;

public class CCC10J5 {
    static boolean[][] visited = new boolean[8][8];
    static int count = Integer.MAX_VALUE;
    static int xf, yf;
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);

        st.nextToken();
        int xi = (int) st.nval - 1;
        st.nextToken();
        int yi = (int) st.nval - 1;
        st.nextToken();
        xf = (int) st.nval - 1;
        st.nextToken();
        yf = (int) st.nval - 1;
        dfs(yi, xi, 0);
        System.out.println(count);
    }

    public static void dfs (int row, int col, int c) {
        if (row < 0 || col < 0 || row > 7 || col > 7) {
            return;
        }
        if (c > 6) {
            return;
        }

        if (col == xf && row == yf) {
            if (c < count) {
                count = c;
            }
            return;
        }

        dfs(row+2, col+1, c+1);
        dfs(row+1, col+2, c+1);
        dfs(row-2, col+1, c+1);
        dfs(row-1, col+2, c+1);
        dfs(row+2, col-1, c+1);
        dfs(row+1, col-2, c+1);
        dfs(row-2, col-1, c+1);
        dfs(row-1, col-2, c+1);
    }
}