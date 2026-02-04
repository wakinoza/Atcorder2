import java.util.*;
import java.util.stream.*;

//ABC380A
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char[] nArray = scanner.next().toCharArray();
    scanner.close();
    int oneCount = 0;
    int twoCount = 0;
    int threeCount = 0;
    for (char n :nArray) {
      if (n == '1') {
        oneCount++;
      } else if (n == '2') {
        twoCount++;
      } else if (n == '3') {
        threeCount++;
      }
    }
    if (oneCount == 1 && twoCount == 2 && threeCount == 3) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}