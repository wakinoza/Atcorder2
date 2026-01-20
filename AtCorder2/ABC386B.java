import java.util.*;
import java.util.stream.*;

//ABC386B
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char[] sArray = scanner.next().toCharArray();
    scanner.close();
    int answer = 0;
    int zeroCount = 0;
    for (char charNumber : sArray) {
      if (charNumber == '0') {
        zeroCount++;
      } else {
        answer++;
        if (zeroCount >= 1) {
          answer += (zeroCount + 1) / 2;
          zeroCount = 0;
        }
      }
    }
    if (zeroCount >= 1) {
      answer += (zeroCount + 1) / 2;
      zeroCount = 0;
    }
    System.out.println(answer);
  }
}
