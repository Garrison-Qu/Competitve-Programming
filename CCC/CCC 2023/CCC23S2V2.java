//15/15

import java.util.*;
import java.io.*;

public class CCC23S2V2 {
  static class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
      br = new BufferedReader(new InputStreamReader(System.in));
    }

    String next() {
      while (st == null || !st.hasMoreElements()) {
        try {
          st = new StringTokenizer(br.readLine());
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      return st.nextToken();
    }

    int nextInt() {
      return Integer.parseInt(next());
    }
  }

  static final int MAXN = 5000 + 50;
  static int n;
  static int[] a = new int[MAXN];
  static int[] val = new int[MAXN];

  static int Read() {
    int s = 0, w = 1;
    char ch = ' ';
    try {
      while (ch > '9' || ch < '0') {
        ch = (char) System.in.read();
        if (ch == '-') {
          w = -1;
        }
      }
      while (ch >= '0' && ch <= '9') {
        s = (s << 3) + (s << 1) + ch - '0';
        ch = (char) System.in.read();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return s * w;
  }

  public static void main(String[] args) {
    n = Read();
    Arrays.fill(val, 0x7f7f7f7f);
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
