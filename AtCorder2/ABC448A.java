import java.util.*;
import java.util.stream.*;

//ABC448A
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int x = scanner.nextInt();
    for (int i = 0; i < n; i++) {
      int a = scanner.nextInt();
      if (a < x) {
        x = a;
        System.out.println(1);
      } else {
        System.out.println(0);
      }
    }

    scanner.close();
  }
}
