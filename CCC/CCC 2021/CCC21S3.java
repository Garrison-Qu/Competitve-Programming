import java.io.*;
import java.util.*;

public class CCC21S3 {
    static int N;
    static int[] P = new int[200000 + 5];
    static int[] W = new int[200000 + 5];
    static int[] D = new int[200000 + 5];
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);

        st.nextToken();
        N = (int) st.nval;

        int minP = 1000000000;
        int maxP = 0;
        for (int i = 0; i < N; i++) {
            st.nextToken();
            P[i] = (int) st.nval;
            if (P[i] < minP) {
                minP = P[i];
            }
            if (P[i] > maxP) {
                maxP = P[i];
            }
            st.nextToken();
            W[i] = (int) st.nval;
            st.nextToken();
            D[i] = (int) st.nval;
        }
        if (N == 1) {
            System.out.println("0");
        } else {
            System.out.println(binarySearch(minP, maxP));
        }
    }

    private static long binarySearch(int lb, int rb) {
        int mid = (rb + lb)/2;
        long left = calculate(mid);
        long right = calculate(mid + 1);

        if (rb - lb == 1) {
            if (left > right) {
                return right;
            } else {
                return left;
            }
        } else if (rb - lb == 2) {
            long[] out = new long[3];
            out[0] = calculate(lb);
            out[1] = calculate(lb+1);
            out[2] = calculate(rb);
            Arrays.sort(out);
            return out[0];
        }
        
        if (left < right) {
            return binarySearch(lb, mid);
        } else if (right < left) {
            return binarySearch(mid+1, rb);
        } else {
            if (calculate(mid+2) < calculate(mid - 1)) {
                return binarySearch(mid+1, rb);
            } else if (calculate(mid+2) > calculate(mid - 1)) {
                return binarySearch(lb, mid);
            } else {
                int a = mid + 1;
                int b = mid;
                while (calculate(a) == calculate(b)) {
                    a++;
                    b--;
                }
                if (calculate(a) < calculate(b)) {
                    return binarySearch(mid+1, rb);
                } else {
                    return binarySearch(lb, mid);
                }
            }
        }
    }

    private static long calculate (int currentP) {
        long sum = 0;

        for (int i = 0; i < N; i++) {
            if (!(currentP > P[i] - D[i] && currentP < P[i] + D[i])){
                sum += (long) (Math.abs((long)currentP - (long)P[i]) - (long)D[i]) * (long)W[i];
            } 
        }
        return sum;
    }
}
