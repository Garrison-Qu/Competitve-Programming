//15/15

import java.io.*;

public class CCC18J3 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);
        
        int[] dis = new int[4];
        int[] pos= new int[5];

        for (int i = 0; i < 4; i++) {
            st.nextToken();
            dis [i] = (int) st.nval;
        }

        pos[0] = 0;
        pos[1] = dis[0];
        pos[2] = pos[1] + dis[1];
        pos[3] = pos[2] + dis[2];
        pos[4] = pos[3] + dis[3];

        for (int i = 0; i < 5; i++) {
            System.out.print(Math.abs(pos[i] - pos[0]) + " ");
        }
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            System.out.print(Math.abs(pos[i] - pos[1]) + " ");
        }
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            System.out.print(Math.abs(pos[i] - pos[2]) + " ");
        }
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            System.out.print(Math.abs(pos[i] - pos[3]) + " ");
        }
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            System.out.print(Math.abs(pos[i] - pos[4]) + " ");
        }
        System.out.println("");
    }
}
