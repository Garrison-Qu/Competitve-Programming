import java.io.*;

public class CCC18S3 {
    public static int row, col;
    public static char[][] map = new char[100 + 5][100 + 5];
    public static boolean[][] empty = new boolean[100 + 5][100 + 5];
    public static int[][] steps = new int[100 + 5][100 + 5];
    public static int currentX, currentY;
    public static boolean[][] seen = new boolean[100 + 5][100 + 5];

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);

        st.nextToken();
        row = (int) st.nval;
        st.nextToken();
        col = (int) st.nval;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                st.nextToken();
                map[i][j] = st.sval.charAt(0);
                    
                if (map[i][j] == 'S') {
                    currentX = j;
                    currentY = i;
                }


            }
        }

        for (int i = 1; i <= col; i++) {
            for (int j = 1; j <= row; j++) {
                if (map[j][i] == '.') {
                    search(i, j, 0);
                }
            }
        }
    }

    private static int search (int x, int y, int count) {
        if (!isValid(x, y)) {
            return -1;
        }
        if (x == currentX && y == currentY) {
            return count;
        }

        if (map[y][x] == 'R') return search(x, y, count);
        return search(x, y, count);
    }

    private static boolean isValid (int x, int y) {
        if (x < 1 || y < 1 || x > col || y > row) {
            return false;
        }
        return true;
    }
}
