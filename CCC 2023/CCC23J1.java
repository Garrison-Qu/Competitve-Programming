//15/15

import java.io.*;

public class CCC23J1 {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        if (A > B) {
            System.out.println(A * 50 - B * 10 + 500);
        } else {
            System.out.println(A * 50 - B * 10);
        }
    }
}
 