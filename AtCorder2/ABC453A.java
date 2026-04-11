import java.util.*;
import java.util.stream.*;

//ABC453A
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    String[] sArray = scanner.next().split("");
    scanner.close();
    boolean needPrint = false;
    StringBuilder answer = new StringBuilder();
    for (String sLetter : sArray) {
      if (!sLetter.equals("o")) {
        needPrint = true;
        answer.append(sLetter);
      } else if (needPrint && sLetter.equals("o")) {
        answer.append(sLetter);
      }
    }
    System.out.println(answer.toString());
  }
}
