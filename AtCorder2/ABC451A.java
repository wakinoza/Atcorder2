import java.util.*;
import java.util.stream.*;

//ABC451A
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String s = scanner.next();
    scanner.close();

    int sLen = s.length();
    String answer;
    if (sLen% 5 != 0) {
      answer = "No";
    } else {
      answer = "Yes";
    }
    System.out.println(answer);
  }
}
