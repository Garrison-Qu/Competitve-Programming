import java.math.BigInteger;
import java.util.Scanner;

public class CCC96S2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            BigInteger a = scanner.nextBigInteger();
            if (check(a).equals(BigInteger.valueOf(11))) {
                System.out.println("The number " + a + " is divisible by 11.");
            } else {
                System.out.println("The number " + a + " is not divisible by 11.");
            }
        }
        scanner.close();
    }

    public static BigInteger check(BigInteger i) {
        System.out.println(i);
        if (i.compareTo(BigInteger.valueOf(11)) <= 0) {
            return i;
        } else {
            BigInteger a = i.mod(BigInteger.TEN);
            String iStr = i.toString();
            String subStr = iStr.substring(0, iStr.length() - 1);
            BigInteger[] list = new BigInteger[subStr.length()];
            for (int j = 0; j < subStr.length(); j++) {
                list[j] = BigInteger.valueOf(Long.parseLong(String.valueOf(subStr.charAt(j))));
            }
            i = magic(list).subtract(a);
            if (i.compareTo(BigInteger.valueOf(11)) > 0) {
                return check(i);
            } else if (i.compareTo(BigInteger.valueOf(11)) < 0) {
                return i;
            }
        }
        return BigInteger.valueOf(11);
    }

    public static BigInteger magic(BigInteger[] numList) {
        StringBuilder sb = new StringBuilder();
        for (BigInteger num : numList) {
            sb.append(num);
        }
        return new BigInteger(sb.toString());
    }
}
