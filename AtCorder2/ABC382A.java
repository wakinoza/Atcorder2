import java.util.*;
import java.util.stream.*;

//ABC382A
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int d = scanner.nextInt();
    char[] sArray = scanner.next().toCharArray();
    scanner.close();
    int emptyCount = 0;
    for (char sLetter :sArray) {
      if (sLetter == '.') {
        emptyCount++;
      }
    }
    System.out.println(Math.min(n, emptyCount + d));
  }
}
