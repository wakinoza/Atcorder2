import java.util.*;
import java.util.stream.*;

//ABC392B
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    boolean[] exists = new boolean[n + 1];
    for (int i = 0; i < m ;i++) {
      exists[scanner.nextInt()] = true;
    }
    scanner.close();
    
    int diff = n - m;
    System.out.println(n - m);
    if (diff == 0) {
      return;
    }
    StringBuilder answer = new StringBuilder();
    for (int i = 1; i <= n; i++) {
      if (!exists[i]) {
        if (answer.length() > 0) {
          answer.append(" ");
        }
        answer.append(i);
      }
    }
    System.out.println(answer.toString());
  }
}
