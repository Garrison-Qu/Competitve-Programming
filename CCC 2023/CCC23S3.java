import java.io.*;
import java.util.*;

public class CCC23S3 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StreamTokenizer st = new StreamTokenizer(br);
    static HashMap<Integer, Character> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        int N = readInt();
        int M = readInt();
        int R = readInt();
        int C = readInt();

        map.put(1, 'a');
        map.put(2, 'b');
        map.put(3, 'c');
        map.put(4, 'd');

        int[][] grid = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                grid[i][j] = 2;
            }
        }

        for (int i = 0; i < N - R; i++) {
            for (int j = 0; j < M - C; j++) {
                grid[i][j] = 1;
            }
        }

        if (R == 0) {
            for (int i = R; i < N; i++) {
                grid[i][M - 1]++;
            }
            for (int i = C; i < M; i++) {
                grid[N - 1][i]++;
            }
        } else if (C == 0) {
            for (int i = C; i < M; i++) {
                grid[N - 1][i]++;
            }
            for (int i = R; i < N; i++) {
                grid[i][M - 1]++;
            }
        } else if (R == N) {
            if ((M ^ C) % 2 == 1) {
                if (M % 2 == 1) {
                    for (int i = 0; i < (M - C) / 2; i++) {
                        grid[0][i]++;
                        grid[0][M - i - 1]++;
                    }
                    grid[0][M / 2]++;
                } else {
                    System.out.println("IMPOSSIBLE");
                    return;
                }
            } else {
                for (int i = 0; i < (M - C) / 2; i++) {
                    grid[0][i]++;
                    grid[0][M - i - 1]++;
                }
            }
        } else if (C == M) {
            if ((R ^ N) % 2 == 1) {
                if (N % 2 == 1) {
                    for (int i = 0; i < (N - R) / 2; i++) {
                        grid[i][0]++;
                        grid[N - i - 1][0]++;
                    }
                    grid[N / 2][0]++;
                } else {
                    System.out.println("IMPOSSIBLE");
                    return;
                }
            } else {
                for (int i = 0; i < (N - R) / 2; i++) {
                    grid[i][0]++;
                    grid[N - i - 1][0]++;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(map.get(grid[i][j]));
            }
            System.out.println();
        }
    }

    public static int readInt() throws IOException {
        st.nextToken();
        return (int) st.nval;
    }
}
