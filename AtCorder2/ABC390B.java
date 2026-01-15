import java.util.*;
import java.util.stream.*;

//ABC390B
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    long[] a = new long[n];
    for (int i = 0; i < n; i++) {
      a[i] = scanner.nextLong();
    }
    boolean isGeometricSequence = true;

    for (int i = 2; i < n; i++) {
      if (a[i - 2] * a[i] != a[i - 1] * a[i - 1]) {
        isGeometricSequence = false;
        break;
      }
    }
    scanner.close();
    String answer = (isGeometricSequence)? "Yes" : "No";
    System.out.println(answer);
  }
}