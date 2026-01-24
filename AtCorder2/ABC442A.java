import java.util.*;
import java.util.stream.*;

//ABC442A
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char[] sArray = scanner.next().toCharArray();
    scanner.close();
    int answer = 0;
    for (char letter :sArray) {
      if (letter == 'i' || letter == 'j') {
        answer++;
      }
    }
    System.out.println(answer);
  }
}
