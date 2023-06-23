import java.util.*;

public class CCC00J2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int st = sc.nextInt();
        int lt = sc.nextInt();
        sc.close();
        
        int counter = 0;
        
        for (int i = st; i < lt; st++) {
            if (String.valueOf(i) == reverse(i)) counter++;
        }
        System.out.println(counter);
    }

    static String reverse (int i) {
        String j = String.valueOf(i);
        String p = "";
        for (int q = j.length() - 1; q > 0; q--) {
            if (j.charAt(q) == '6') {
                p += '9';
            } else if (j.charAt(q) == '9') {
                p += '6';
            }
            p += j.charAt(q);
        }
        return p;
    }
}
