import java.util.*;
import java.util.stream.*;

//ABC402A
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char[] sArray = scanner.next().toCharArray();
    scanner.close();
    StringBuilder answer = new StringBuilder();
    for (char sLetter : sArray) {
      int sLetterAscCode = sLetter;
      if (sLetterAscCode <= 90) {
        answer.append(sLetter);
      }
    }
    System.out.println(answer.toString());
  }
}
