import java.io.*;

public class CCC18S2 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);

        st.nextToken();
        int N = (int) st.nval;
        
        int[][] sunflowers = new int [N][N];

        for (int row = 0; row < N; row++) {
            for (int column = 0; column < N; column++) {
                st.nextToken();
                sunflowers[row][column] = (int) st.nval;
            }
        }

        //smallest number at top left
        if ((sunflowers[0][0] < sunflowers[0][N-1]) && (sunflowers[0][0] < sunflowers[N-1][0]) && (sunflowers[0][0] < sunflowers[N-1][N-1])) {
            for (int row = 0; row < N; row++) {
                for (int column = 0; column < N; column++) {
                    System.out.print(sunflowers[row][column] + " ");
                }
                System.out.println();
            }
        }

        //smallest number at bottom left
        else if ((sunflowers[N-1][0] < sunflowers[0][0]) && (sunflowers[N-1][0] < sunflowers[0][N-1]) && (sunflowers[N-1][0] < sunflowers[N-1][N-1])) {
            for (int column = 0; column < N; column++) {
                for (int row = N-1; row >= 0; row--) {
                    System.out.print(sunflowers[row][column] + " ");
                }
                System.out.println();
            }
        }

        //smallest number at top right
        else if ((sunflowers[0][N-1] < sunflowers[0][0]) && (sunflowers[0][N-1] < sunflowers[N-1][0]) && (sunflowers[0][N-1] < sunflowers[N-1][N-1])) {
            for (int column = N-1; column >= 0; column--) {
                for (int row = 0; row < N; row++) {
                    System.out.print(sunflowers[row][column] + " ");
                }
                System.out.println();
            }
        }

        //smallest number at bottom right
        else if ((sunflowers[N-1][N-1] < sunflowers[0][0]) && (sunflowers[N-1][N-1] < sunflowers[N-1][0]) && (sunflowers[N-1][N-1] < sunflowers[0][N-1])) {
            for (int row = N-1; row >= 0; row--) {
                for (int column = N-1; column >= 0; column--) {
                    System.out.print(sunflowers[row][column] + " ");
                }
                System.out.println();
            }
        }
    }
}