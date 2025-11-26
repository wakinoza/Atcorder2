import java.util.*;
import java.util.stream.*;

//ABC407A
//public class ABC   {
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double a = scanner.nextDouble();
    int b = scanner.nextInt();
    scanner.close();
    System.out.println(Math.round(a / b));
  }
}
