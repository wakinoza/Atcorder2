import java.util.*;
import java.util.stream.*;

//ABC383A
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int waterTotal = 0;
    int prevT = scanner.nextInt();
    int firstV = scanner.nextInt();
    waterTotal += firstV;
    for (int i = 1; i < n; i++) {
      int t = scanner.nextInt();
      int v = scanner.nextInt();
      waterTotal = Math.max(0, waterTotal - (t - prevT)) + v;
      prevT = t;
    }
    scanner.close();
    System.out.println(waterTotal);
  }
}