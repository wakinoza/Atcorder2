import java.util.*;
import java.util.stream.*;

//ABC394C
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char[] sArray = scanner.next().toCharArray();
    scanner.close();

    int sLength = sArray.length;
    char nextLetter = sArray[sLength - 1];
    for (int i = sLength - 2; i >= 0; i--) {
      if (sArray[i] == 'W' && nextLetter == 'A') {
        sArray[i] = 'A';
        sArray[i + 1] = 'C';
      }
      nextLetter = sArray[i];
    }
    
    StringBuilder answer = new StringBuilder();
    for (char letter : sArray) {
      answer.append(letter);
    }
    System.out.println(answer.toString());
  }
}
