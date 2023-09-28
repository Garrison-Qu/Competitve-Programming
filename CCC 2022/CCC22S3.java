import java.io.*;

public class CCC22S3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);

        st.nextToken();
        long N = (long) st.nval;
        st.nextToken();
        long M = (long) st.nval;
        st.nextToken();
        long K = (long) st.nval;

        solve(N, M, K);
    }

    public static void solve(long N, long M, long K) {
        // K > N(N+1)/2
        if (K > (1 + N) * N / 2) {
            System.out.println("-1");
            return;
        }

        // N > K
        if (N > K) {
            System.out.println("-1");
            return;
        }

        // N = K
        if (N == K) {
            for (long i = 0; i < N - 1; i++) {
                System.out.print("1 ");
            }
            System.out.println("1");
            return;
        }

        // N < K < 2N
        if (K < 2 * N) {
            long diff = K - N;
            if (diff % 2 == 1) {
                System.out.print("2 ");
            }
            for (int i = 0; i < diff / 2; i++) {
                System.out.print("1 2 ");
            }
            for (int i = 0; i < N - diff; i++) {
                System.out.print("1 ");
            }
            return;
        }

        if (N == M) {
            if (K > N * (N - 1) / 2) {
                long diff = N * (N + 1) / 2 - K;
                for (int i = 1; i < N; i++) {
                    System.out.print(i + " ");
                }
                if (diff != 0) {
                    System.out.println(diff);
                } else {
                    System.out.println(N);
                }
                return;
            }
        }

        System.out.println("-1");
        return;
    }
}