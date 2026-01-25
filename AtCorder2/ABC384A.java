import java.util.*;
import java.util.stream.*;

//ABC384A
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    String c1 = scanner.next();
    String c2 = scanner.next();
    String[] sArray = scanner.next().split("");
    scanner.close();
    StringBuilder answer = new StringBuilder();
    for (String s : sArray) {
      if (s.equals(c1)) {
        answer.append(c1);
      } else {
        answer.append(c2);
      }
    }
    System.out.println(answer.toString());
  }
}
