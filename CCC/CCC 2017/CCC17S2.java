import java.io.*;
import java.util.*;

public class CCC17S2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);

        ArrayList<Integer> N = new ArrayList<Integer>();
        ArrayList<Integer> output = new ArrayList<Integer>();

        st.nextToken();
        int input = (int) st.nval;

        for (int i = 0; i < input; i++) {
            st.nextToken();
            N.add((int) st.nval);
        }

        Collections.sort(N);

        if (input % 2 == 0) {
            for (int i = 0; i < (int) input / 2; i++) {
                output.add(0, N.get(input - 1 - i));
                output.add(0, N.get(i));
            }
        } else {
            for (int i = 0; i < (int) input / 2; i++) {
                output.add(0, N.get(i));
                output.add(0, N.get(input - 1 - i));
            }
            output.add(0, N.get((int) input / 2));
        }

        for (int i = 0; i < input - 1; i++) {
            System.out.print(output.get(i) + " ");
        }
        System.out.println(output.get(input - 1));
    }
}