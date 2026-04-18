import java.util.*;
import java.util.stream.*;

//ABC454A
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final int L = scanner.nextInt();
    final int R = scanner.nextInt();
    scanner.close();
    System.out.println(R - L + 1);
  }
}
