import java.io.*;

public class CCC20J4 {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StreamTokenizer st = new StreamTokenizer(br);
    st.nextToken();
    String T = st.sval;
    st.nextToken();
    String S = st.sval;
    boolean yes = false;
    
    int length = S.length();
    String[] R = new String[length];
    
    for (int i = 0; i < length; i++) {
      R[i] = S.substring(i) + S.substring(0, i);
    }

    for (int j = 0; j < length; j++) {
        if (T.contains(R[j])){
          yes = true;
          break;
        }
    }
    if (yes) {
      System.out.println("yes");
    } else {
      System.out.println("no");
    }
  }
}