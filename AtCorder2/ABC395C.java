import java.util.*;
import java.util.stream.*;

//ABC395C
public class Main {
  public static void main(String[] args) {
    final int MAX = 1000000;
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] indexes = new int[MAX + 1];
    Arrays.fill(indexes, 0);
    int minDistance = Integer.MAX_VALUE;;
    for (int i = 1; i <= n; i++) {
      int a = scanner.nextInt();
      if (indexes[a] != 0) {
        int prevIndex = indexes[a];
        int distance = i - prevIndex + 1;
        if (minDistance > distance) {
          minDistance = distance;
        }
      }
      indexes[a] = i;
    }
    scanner.close();
    int answer = (minDistance == Integer.MAX_VALUE)? -1 : minDistance;
    System.out.println(answer);
  }
}
