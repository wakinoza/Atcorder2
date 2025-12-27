import java.util.*;
import java.util.stream.*;

//ABC438A
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int d = scanner.nextInt();
    int f = scanner.nextInt();
    scanner.close();
    int surplus = (d - f) % 7;
    System.out.println(7 - surplus);
  }
}
