import java.util.*;
import java.util.stream.*;

//ABC437a
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final int FEET = 12;
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    scanner.close();
    System.out.println(FEET * a + b);
  }
}
