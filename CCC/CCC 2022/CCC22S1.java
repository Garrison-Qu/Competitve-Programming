import java.io.*;

public class CCC22S1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);

        st.nextToken();
        int i = (int) st.nval;
        int FOUR_max;
        if (i % 4 == 0) {
            FOUR_max = i/4;
        } else {
            FOUR_max = (int) i/4 + 1;
        }
        int FIVE_max;
        if (i % 5 == 0) {
            FIVE_max = i/5;
        } else {
            FIVE_max = (int) i/5 + 1;
        }

        int count = 0;

        for (int j = FOUR_max; j >= 0; j--) {
            for (int q = FIVE_max; q >= 0; q--){
                if ((j*4 + q*5) == i) {
                    count++;
                }   
            }
        }
        System.out.println(count);
    }
}
