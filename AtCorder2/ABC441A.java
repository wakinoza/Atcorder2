import java.util.*;
import java.util.stream.*;

//ABC441A
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int p = scanner.nextInt();
    int q = scanner.nextInt();
    int x = scanner.nextInt();
    int y = scanner.nextInt();
    scanner.close();
    if (p <= x &&  x < p + 100 && q <= y && y < q + 100) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
    
  }
}