
import java.util.*;

// A06
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int q = scanner.nextInt();
    int[] aArraySum = new int[n];
    aArraySum[0] = scanner.nextInt();
    for (int i = 1; i < n; i++) {
      aArraySum[i] = scanner.nextInt() + aArraySum[i - 1];
    }
    int l;
    int r;
    for (int i = 0; i < q; i++) {
      l = scanner.nextInt() - 1;
      r = scanner.nextInt() - 1;
      if (l == 0) {
        System.out.println(aArraySum[r]);
      } else {
        System.out.println(aArraySum[r] - aArraySum[l - 1]);
      }
    }
    scanner.close();
  }
}