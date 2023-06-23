    import java.io.*;

    public class CCC14J3 {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StreamTokenizer st = new StreamTokenizer(br);

            int Counter1 = 0;
            int Counter2 = 0;

            st.nextToken();
            int N = (int) st.nval;
            for (int i = 0; i < N; i++) {
                st.nextToken();
                int A = (int) st.nval;
                st.nextToken();
                int B = (int) st.nval;
                if (A > B) {
                    Counter2 += A;
                } else if (A < B) {
                    Counter1 += B;
                }
            }

            System.out.println(100 - Counter1);
            System.out.println(100 - Counter2);
        }
    }
