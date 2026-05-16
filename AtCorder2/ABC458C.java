import java.util.*;
import java.util.stream.*;

//ABC458C
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char[] S = scanner.next().toCharArray();
    scanner.close();
    int sLength = S.length;
    long answer = 0L;
    for (int i = 0; i <=  sLength - 1; i++) {
      if (S[i] == 'C') {
        answer += Math.min(i, sLength - i - 1) + 1;
      }
    }
    System.out.println(answer);
  }
}