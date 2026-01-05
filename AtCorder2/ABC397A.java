import java.util.*;
import java.util.stream.*;

//ABC397A
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double x = scanner.nextDouble();
    scanner.close();
    if (x >= 38) {
      System.out.println(1);
    } else if (x < 38 && x >= 37.5) {
      System.out.println(2);
    } else {
      System.out.println(3);
    }
  }
}
