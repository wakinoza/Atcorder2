import java.util.*;
import java.util.stream.*;

//ABC384B
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int r = scanner.nextInt();
    for (int i = 0; i < n; i++) {
      int d = scanner.nextInt();
      int a = scanner.nextInt();
      if ((d == 1 && 1600 <= r && r <= 2799) || (d == 2 && 1200 <= r && r <= 2399)){
        r += a;
      }
    }
    scanner.close();
    System.out.println(r);
  }
}
