import java.util.*;
import java.util.stream.*;

//ABC395A
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    boolean isIncrease = true;
    int prevA = scanner.nextInt();
    for (int i = 1; i < n; i++) {
      int currentA = scanner.nextInt();
      if (currentA <= prevA) {
        isIncrease = false;
      }
      prevA = currentA;
    }
    scanner.close();
    if (isIncrease) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
