import java.util.*;
import java.util.stream.*;

//ABC392A
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a1 = scanner.nextInt();
    int a2 = scanner.nextInt();
    int a3 = scanner.nextInt();
    scanner.close();
    if (a1 * a2 == a3 || a2 * a3 == a1 || a1 * a3 == a2) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

  }
}
