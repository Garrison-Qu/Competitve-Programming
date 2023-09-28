import java.io.*;

public class CCC20S2 {
    static int row, col;
    static int[][] room = new int[1000 + 5][1000 + 5];
    static int currentX, currentY;
    static boolean output = false;
    static boolean[][] visited = new boolean[1000 + 5][1000 + 5];

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
                room[i][j] = (int) st.nval;
            }
        }

        if (search(row, col)) System.out.println("yes");
        else System.out.println("no");
    }

    private static boolean search (int r, int c) {
        if ((r == 1 && c == 1) || (double) room[1][1]/r == (double) c){
            return true;
        }
        
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (room[i][j] == r*c && !visited[i][j]) {
                    visited[i][j] = true;
                    if (search(i, j)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
