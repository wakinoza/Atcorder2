import java.util.*;
import java.util.stream.*;

//ABC403A
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int oddTotal = 0;
    for (int i = 1; i <= n; i +=2) {
      oddTotal += scanner.nextInt();
      if (i + 1 <= n) {
        int number = scanner.nextInt();
      }
    }
    scanner.close();
    System.out.println(oddTotal);
  }
}
