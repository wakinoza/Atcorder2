import java.util.*;
import java.util.stream.*;

//ABC
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char[] sArray = scanner.next().toCharArray();
    scanner.close();
    int twoCount = 0;
    for (char number : sArray) {
      if ( number == '2') {
        twoCount++;
      }
    }
    System.out.println("2".repeat(twoCount));
  }
}
