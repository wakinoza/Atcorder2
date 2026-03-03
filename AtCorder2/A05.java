import java.util.*;

//A05
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int k = scanner.nextInt();
    scanner.close();
    long answer = 0L;
    int diff;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        diff = k - i - j;
        if (diff >= 1 && diff <= n) {
          answer++;
        }
      }
    }
    System.out.println(answer);
  }
}
