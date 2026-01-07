import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    Long[] b = new Long[n];
    for (int i = 0; i < n; i++) {
      b[i] = sc.nextLong();
    }
    Long[] w = new Long[m];
    for (int i = 0; i < m; i++) {
      w[i] = sc.nextLong();
    }

    Arrays.sort(b, Collections.reverseOrder());
    Arrays.sort(w, Collections.reverseOrder());

    long total = 0;
    int countB = 0;

    for (int i = 0; i < n; i++) {
      if (b[i] >= 0) {
        total += b[i];
        countB++;
      } else {
        break;
      }
    }

    for (int i = 0; i < Math.min(countB, m); i++) {
      if (w[i] >= 0) {
        total += w[i];
      }
    }
    for (int i = countB; i < n; i++) {
      long currentW;
      if (i < m) {
        currentW = w[i];
      } else {
        currentW = Long.MIN_VALUE;
      }
      long nextChoice = b[i] + Math.max(0, currentW);

      if (nextChoice > 0) {
        total += nextChoice;
      } else {
        break;
      }
    }

    System.out.println(total);
  }
}