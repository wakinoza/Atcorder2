import java.util.*;
import java.util.stream.*;

//ABC443B
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int k = scanner.nextInt();
    scanner.close();
    long total = n;
    int addYear = 0;
    while (total < k) {
      addYear++;
      total += n + addYear;
    }
    System.out.println(addYear);
  }
}
