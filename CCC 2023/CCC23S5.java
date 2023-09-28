//3/15

import java.util.*;

public class CCC23S5 {
    static ArrayList<Integer> output = new ArrayList<Integer>();
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();
        if (input < Math.pow(3, 16)) {
            System.out.println("0");
            System.out.println("1");
            for (int i = 2; i < input-1; i++) {
                printing(i, input);
            }
            System.out.println(input-1);
            System.out.println(input);
        } else if (input == Math.pow(3, 16)) {
            for (int i = 0; i <= input/3; i++) {
                printing2(i, input/3);
            }
            for (int i = 0; i < output.size(); i++) {
                System.out.println(output.get(i));
            }
            for (int i = 0; i < output.size(); i++) {
                System.out.println(output.get(i) + 2*input/3);
            }
        } else if (input == Math.pow(3, 17)){
            for (int i = 0; i <= input/3; i++) {
                printing2(i, input/3);
            }
            for (int i = 0; i < output.size(); i++) {
                System.out.println(output.get(i));
            }
            for (int i = 0; i < output.size(); i++) {
                System.out.println(output.get(i) + 2*input/3);
            }
        } else {
            for (int i = 0; i <= input/27; i++) {
                printing2(i, input/27);
            }
            for (int i = 0; i < output.size(); i++) {
                System.out.println(output.get(i));
            }
            for (int i = 0; i < output.size(); i++) {
                System.out.println((long)output.get(i) + (long)2*input/27);
            }
            for (int i = 0; i < output.size(); i++) {
                System.out.println((long)output.get(i) + (long)6*input/27);
            }
            for (int i = 0; i < output.size(); i++) {
                System.out.println((long)output.get(i) + (long) 8*input/27);
            }
            for (int i = 0; i < output.size(); i++) {
                System.out.println((long)output.get(i) + (long) 18*input/27);
            }
            for (int i = 0; i < output.size(); i++) {
                System.out.println((long)output.get(i) + (long) 20*input/27);
            }
            for (int i = 0; i < output.size(); i++) {
                System.out.println((long)output.get(i) + (long) 24*input/27);
            }
            for (int i = 0; i < output.size(); i++) {
                System.out.println((long)output.get(i) + (long) 26*input/27);
            }
        }
    }

    static void printing2(int i, int input) {
        if (((double) i)/input > 0.3333333333333333 && ((double) i)/input < 0.6666666666666666) {
            return;
        } 
        if (((double) i)/input == 3 || ((double) i)/input == 1.5){
            output.add(i);
            return;
        }
        if (check(i, input) == true) {
            
            output.add(i);
            return;
        }
    }
    
    static void printing(int i, int input) {
        if (((double) i)/input > 0.3333333333333333 && ((double) i)/input < 0.6666666666666666) {
            return;
        } 
        if (((double) i)/input == 3 || ((double) i)/input == 1.5){
            System.out.println(i);
            return;
        }
        if (check(i, input) == true) {
            System.out.println(i);
            return;
        }
    }

    static boolean check(int x, int input) {
        double rem = x;
        for (int i = 0; i < 16; i++) {
            if (rem/input > 1){
                if (Math.floor(rem/input) == 1){
                    return false;
                }
            } 
            rem = (rem % input) * 3;
        }
        return true;
    }
}