import java.io.*;

public class CCC20S2V2 {
    static int row, col;
    static int[][] room = new int[1000 + 1][1000 + 1];
    static boolean[] visited = new boolean[1001 * 1001];
    static int target;

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);

        st.nextToken();
        row = (int) st.nval;
        st.nextToken();
        col = (int) st.nval;

        target = row*col;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                st.nextToken();
                room[i][j] = (int) st.nval;
            }
        }

        if(search(1, 1)) System.out.println("yes");
        else System.out.println("no");
    }

    private static boolean search (int r, int c) {
        //System.out.println(r + " " + c);
        if (room[r][c] == target) {
            return true;
        }
        int room_num = room[r][c];
        int max = (int)Math.ceil(Math.sqrt(room_num));
        for (int i = 1; i <= max; i++) {
            if (room_num % i == 0) {
                if (room_num/i <= col && i <= row) {
                    if (!visited[room[i][room_num/i]]) {
                        visited[room[i][room_num/i]] = true;
                        if (search(i, room_num/i)){
                            return true;
                        }
                    }
                }
                if (i <= col && room_num/i <= row) {
                    if (!visited[room[room_num/i][i]]) {
                        visited[room[room_num/i][i]] = true;
                        if(search(room_num/i, i)){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    } 
}