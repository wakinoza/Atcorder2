import java.util.*;
import java.util.stream.*;

//ABC397B
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char[] sArray = scanner.next().toCharArray();
    scanner.close();

    int index = 1;
    int answer = 0;
    for (char letter :sArray) {
      if (letter == 'i' && index % 2 == 0 || letter == 'o' && index % 2 == 1 ) {
        answer++;
        index++;
      }
      index++;
    }
    if (index % 2 == 0) {
      answer++;
    }
    System.out.println(answer);
  }
}
