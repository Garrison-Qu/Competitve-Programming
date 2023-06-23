import java.util.*;

public class CCC23S2 {
    public static int Read() {
        int s = 0, w = 1;
        char ch = ' ';
        try {
            while (ch > '9' || ch < '0') {
                if (ch == '-')
                    w = -1;
                ch = (char) System.in.read();
            }
            while (ch >= '0' && ch <= '9') {
                s = (s << 3) + (s << 1) + ch - '0';
                ch = (char) System.in.read();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return s * w;
    }

    public static void main(String[] args) {
        int n = Read();
        int[] a = new int[n + 1];
        int[] val = new int[n + 1];

        Arrays.fill(val, Integer.MAX_VALUE);

        for (int i = 1; i <= n; i++) {
            a[i] = Read();
        }

        for (int i = 1; i <= n; i++) {
            int cur = 0;
            for (int l = 0; i + l <= n && i - l >= 1; l++) {
                cur += Math.abs(a[i - l] - a[i + l]);
                val[l * 2 + 1] = Math.min(val[l * 2 + 1], cur);
            }
        }

        for (int i = 1; i < n; i++) {
            int cur = 0;
            for (int l = 1; i - l + 1 >= 1 && i + l <= n; l++) {
                cur += Math.abs(a[i - l + 1] - a[i + l]);
                val[l * 2] = Math.min(val[l * 2], cur);
            }
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(val[i] + " ");
        }
    }
}