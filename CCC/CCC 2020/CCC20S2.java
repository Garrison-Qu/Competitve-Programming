import java.io.*;

public class CCC20S2 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);

        st.nextToken();
        int row = (int) st.nval;
        st.nextToken();
        int col = (int) st.nval;
        
        int[][] arr = new int[1001][1001];
        for (int i = 1; i < row+1; i++) {
            for (int j = 1; j < col+1; j++) {
                st.nextToken();
                arr[col][row] = (int) st.nval;
            }
        }
    }
}
