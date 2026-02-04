import java.util.*;
import java.util.stream.*;

//ABC380B
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char[] sArray = scanner.next().toCharArray();
    scanner.close();
    StringBuilder answer = new StringBuilder();
    int barCount = 0;
    for (int i = 1; i < sArray.length; i++) {
      char current = sArray[i];
      if (current == '|') {
        if (!answer.isEmpty()) {
          answer.append(" ");
        }
        answer.append(barCount);
        barCount = 0;
      } else {
        barCount++;
      }
    }
    System.out.println(answer.toString());
  }
}
