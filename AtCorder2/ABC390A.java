import java.util.*;
import java.util.stream.*;

//ABC390A
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    StringBuilder aSB = new StringBuilder();
    for (int i = 0; i < 5; i++) {
      aSB.append(scanner.nextInt());
    }
    scanner.close();
    String a = aSB.toString();
    if (a.equals("21345") || a.equals("13245") || a.equals("12435") || a.equals("12354")) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
