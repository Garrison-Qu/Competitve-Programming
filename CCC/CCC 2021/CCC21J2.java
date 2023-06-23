//15/15

import java.io.BufferedReader;
import java.io.*;

public class CCC21J2 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(input.readLine());

        String[] name = new String[num];
        int[] bid = new int[num];
        
        for (int i = 0; i < num; i++){
            name[i] = input.readLine();
            bid[i] = Integer.parseInt(input.readLine());
        }
        input.close();

        int high = 0;

        int highestBid = Integer.MIN_VALUE;

        for (int j = 0; j < num; j++){
            if (bid[j] > highestBid) {
                highestBid = bid[j];
                high = j;
            }
        }
        System.out.println(name[high]);
    }
}