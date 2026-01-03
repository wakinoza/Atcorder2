import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    scanner.close();
    int[] count = new int[N + 1];
    for (long x = 1; x * x < N; x++) {
      for (long y = x + 1; y * y < N; y++) {
        long n = x * x + y * y;
        if (n <= N) {
          count[(int) n]++;
        }
      }
    }

    StringBuilder sb = new StringBuilder();
    int answersCount = 0;
    for (int i = 1; i <= N; i++) {
      if (count[i] == 1) {
        if (answersCount > 0)
          sb.append(" ");
        sb.append(i);
        answersCount++;
      }
    }
    System.out.println(answersCount);
    if (answersCount > 0) {
      System.out.println(sb.toString());
    }
  }
}
