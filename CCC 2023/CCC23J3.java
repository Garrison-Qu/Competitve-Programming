//15/15

import java.util.*;

public class CCC23J3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String[] attendance = new String[N];
        for (int i = 0; i < N; i++) {
            attendance[i] = sc.nextLine();
        }
        sc.close();
        ArrayList<Integer> outputList = new ArrayList<Integer>();
        int[] index = new int[5];

        for (int i = 0; i < 5; i++){
            for (int j = 0; j < N; j++) {
                if (attendance[j].charAt(i) == 'Y') {
                    index[i]++;
                }
            }
        }
        int maxIdx = -5;
        for (int i = 0; i < 5; i++) {
            if (index[i] > maxIdx) {
                maxIdx = index[i];
            }
        }
        for (int i = 0; i < 5; i++) {
            if (index[i] == maxIdx) {
                outputList.add(i+1);
            }
        }

        if (outputList.size() > 0) {
            while (outputList.size() > 1) {
                System.out.print(outputList.get(0) + ",");
                outputList.remove(0);
            }
            if (outputList.size() == 1) {
                System.out.print(outputList.get(0));
            }
        } else {
            System.out.println(outputList.get(0));
        }
    }
}
