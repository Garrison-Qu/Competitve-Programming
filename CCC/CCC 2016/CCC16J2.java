import java.io.*;

public class CCC16J2 {
    
    static int[][] value = new int[4][4];

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                st.nextToken();
                value[j][i] = (int) st.nval;
            }
        }

        if (check() == true) {
            System.out.println("magic");
        } else {
            System.out.println("not magic");
        }
    }

    public static boolean check () {
        int sum = 0; 
        int record;

        for (int i = 0; i < 4; i++) {
            sum += value[i][1];
        }
        
        record = sum;

        for (int row = 1; row < 4; row++) {
            for (int colume = 0; colume < 4; colume++) {
                sum -= value[colume][row];
            }
            if (sum != 0) {
                /*System.out.println(sum);
                System.out.println(record);*/
                return false;
            }
            sum = record;
        }
        
        for (int colume = 0; colume < 4; colume++) {
            for (int row = 0; row < 4; row++) {
                sum -= value[colume][row];
            }
            if (sum != 0) {
                return false;
            }
            sum = record;
        }

        return true;
    }
}
