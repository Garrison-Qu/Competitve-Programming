import java.util.Scanner;

public class CCC20J2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int P = in.nextInt();
    int N = in.nextInt();
    int R = in.nextInt();
    in.close();
    int total = N;
    int day;
    for (day = 1; total <= P; day++){
      total += (Math.pow(R, day) * N);
    } 
    if (total > P){
      System.out.println(day - 1);
    }
  }
}