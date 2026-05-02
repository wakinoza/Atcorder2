import java.util.*;
import java.util.stream.*;

//ABC456A
public class Main {
  public static void main(String[] args) {
    Set<Integer> results = new HashSet<>();
    for (int i = 1; i <= 6; i++) {
      for (int j = 1; j <= 6; j++) {
        for (int k = 1; k <= 6; k++) {
          results.add(i + j + k);
        }
      }
    }
    Scanner scanner = new Scanner(System.in);
    final int X = scanner.nextInt();
    scanner.close();
    String answer = "No";
    if (results.contains(X)) {
      answer = "Yes";
    }
    System.out.println(answer);
  }
}
