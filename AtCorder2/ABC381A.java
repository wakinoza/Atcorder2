import java.util.*;
import java.util.stream.*;

//ABC381A
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    char[] sArray = scanner.next().toCharArray();
    scanner.close();

    boolean result = true;
    if (n % 2 == 0) {
      result = false;
    } else {
      int middleIndex = ((n + 1) / 2) - 1;
      for (int i = 0; i < n; i++) {
        if (i < middleIndex && sArray[i] != '1') {
          result = false;
          break;
        } else if (i == middleIndex && sArray[i] != '/') {
          result = false;
          break;
        } else if (i > middleIndex && sArray[i] != '2') {
          result = false;
          break;
        }
      }
    }
    String answer = (result)? "Yes" : "No";
    System.out.println(answer);
  }
}
