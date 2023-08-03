import java.util.*;

public class CCC19S3 {
    public static void main(String[] args) {
        long num[] = new long[9];
        Scanner sc = new Scanner(System.in);
        String[] as1 = sc.nextLine().split(" ");
        String[] as2 = sc.nextLine().split(" ");
        String[] as3 = sc.nextLine().split(" ");
        sc.close();
        ArrayList<Integer> target = new ArrayList<Integer>();

        for (int i = 0; i < 3; i++) {
            if (as1[i].charAt(0) != 'X') {
                num[i] = Integer.parseInt(as1[i]);
            } else {
                target.add(i);
            }
            if (as2[i].charAt(0) != 'X') {
                num[i + 3] = Integer.parseInt(as2[i]);
            } else {
                target.add(i + 3);
            }
            if (as3[i].charAt(0) != 'X') {
                num[i + 6] = Integer.parseInt(as3[i]);
            } else {
                target.add(i + 6);
            }
        }

        for (int i = 0; i < 3; i++) {
            if (target.contains(0 + 3 * i) || target.contains(1 + 3 * i) || target.contains(2 + 3 * i)) {
                if (target.contains(0 + 3 * i) && target.contains(1 + 3 * i) && target.contains(2 + 3 * i)) {
                    num[0 + 3 * i] = 0;
                    num[1 + 3 * i] = 2;
                    num[2 + 3 * i] = 4;
                } else if (target.contains(0 + 3 * i) && target.contains(1 + 3 * i) && !target.contains(2 + 3 * i)) {
                    num[0 + 3 * i] = num[2 + 3 * i] - 4;
                    num[1 + 3 * i] = num[2 + 3 * i] - 2;
                } else if (target.contains(0 + 3 * i) && !target.contains(1 + 3 * i) && target.contains(2 + 3 * i)) {
                    num[0 + 3 * i] = num[1 + 3 * i] - 2;
                    num[2 + 3 * i] = num[1 + 3 * i] + 2;
                } else if (!target.contains(0 + 3 * i) && target.contains(1 + 3 * i) && target.contains(2 + 3 * i)) {
                    num[2 + 3 * i] = num[0 + 3 * i] + 4;
                    num[1 + 3 * i] = num[0 + 3 * i] + 2;
                } else if (!target.contains(0 + 3 * i) && !target.contains(1 + 3 * i) && target.contains(2 + 3 * i)) {
                    num[2 + 3 * i] = num[1 + 3 * i] + num[1 + 3 * i] - num[0 + 3 * i];
                } else if (target.contains(0 + 3 * i) && !target.contains(1 + 3 * i) && !target.contains(2 + 3 * i)) {
                    num[0 + 3 * i] = num[1 + 3 * i] + num[2 + 3 * i] - num[1 + 3 * i];
                } else if (!target.contains(0 + 3 * i) && target.contains(1 + 3 * i) && !target.contains(2 + 3 * i)) {
                    num[1 + 3 * i] = (num[2 + 3 * i] + num[0 + 3 * i])/2;
                }
            }
        }
        System.out.println(num[0] + " " + num[1] + " " + num[2]);
        System.out.println(num[3] + " " + num[4] + " " + num[5]);
        System.out.println(num[6] + " " + num[7] + " " + num[8]);
    }
}
