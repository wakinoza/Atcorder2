import java.util.*;
import java.util.stream.*;

//ABC444B
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int k = scanner.nextInt();
    scanner.close();
    int answer = 0;
    for (int i = 1; i <=n; i++) {
      int currentI = i;
      int currentSum = 0;
      while(currentI > 0) {
        currentSum += currentI % 10;
        currentI = currentI / 10;
      }
      if (currentSum == k) {
        answer++;
      }
    }
    System.out.println(answer);
  }
}
