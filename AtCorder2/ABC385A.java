import java.util.*;
import java.util.stream.*;

//ABC385A
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    scanner.close();
    String answer = "No";
    if (a == b && b == c && a == c) {
      answer = "Yes";
    } else if (a == b + c || b == c + a || c == a + b) {
      answer = "Yes";
    }
    System.out.println(answer);
  }
}
