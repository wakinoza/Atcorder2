import java.util.*;
import java.util.stream.*;

//ABC458A
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String S = scanner.next();
    final int N = scanner.nextInt();
    scanner.close();
    int sLength = S.length();
    System.out.println(S.substring(N,sLength - N));
  }
}
