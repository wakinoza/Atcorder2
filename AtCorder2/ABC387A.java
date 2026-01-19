import java.util.*;
import java.util.stream.*;

//ABC387A
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    scanner.close();
    long answer = (a + b) * (a + b);
    System.out.println(answer);
  }
}
