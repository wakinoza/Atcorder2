import java.util.*;
import java.util.stream.*;

//ABC394B
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    String[] sArray = new String[n];
    for (int i = 0; i < n ;i++) {
      sArray[i] = scanner.next();
    }
    scanner.close();
    Arrays.sort(sArray, Comparator.comparingInt(String::length));
    StringBuilder answer = new StringBuilder();
    for (String s :sArray) {
      answer.append(s);
    }
    System.out.println(answer.toString());
  }
}
