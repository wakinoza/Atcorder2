import java.util.*;
import java.util.stream.*;

//ABC382B
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int d = scanner.nextInt();
    char[] sArray = scanner.next().toCharArray();
    scanner.close();
    int currentD = d;
    for (int i = sArray.length - 1; i >= 0; i--) {
      if (currentD >= 1 && sArray[i] == '@') {
        sArray[i] = '.';
        currentD--;
      }
    }
    StringBuilder answer = new StringBuilder();
    for (char sLetter :sArray) {
      answer.append(sLetter);
    }
    System.out.println(answer.toString());
  }
}
