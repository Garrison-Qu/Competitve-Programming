//15/15

import java.io.*;

public class CCC22S1 {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);

        st.nextToken();
        int num = (int) st.nval;
        int solution = 0;
        while (num >= 0) {  
            if (num % 5 == 0) {
                solution++;
            }
            num -= 4;
        }      
        
        System.out.println(solution);

    }
}
