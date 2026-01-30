import java.util.*;
import java.util.stream.*;

//ABC381B
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char[] sArray = scanner.next().toCharArray();
    scanner.close();
    int sLength = sArray.length;
    if (sLength % 2 == 1) {
      System.out.println("No");
      return;
    }
    boolean result = true;
    Set<Character> usedLetter =  new HashSet<>();
    for (int i = 0; i < sLength; i += 2) {
      char currentLetter = sArray[i];
      if (currentLetter != sArray[i + 1]) {
        result = false;
        break;
      }
      if (usedLetter.contains(currentLetter)) {
        result = false;
        break;
      }
      usedLetter.add(currentLetter);
    }
    String answer = (result) ? "Yes" : "No";
    System.out.println(answer);
  }
}