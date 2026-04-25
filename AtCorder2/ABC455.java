import java.util.*;
import java.util.stream.*;

//ABC455A
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final int A = scanner.nextInt();
    final int B = scanner.nextInt();
    final int C = scanner.nextInt();
    scanner.close();
    if (A != B && B == C) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
