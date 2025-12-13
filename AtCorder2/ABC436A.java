import java.util.*;
import java.util.stream.*;

//ABC436A
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    String s = scanner.next();
    scanner.close();

    int oLength = n - s.length();
    String oString = "o".repeat(oLength);
    System.out.println(oString + s);
  }
}
