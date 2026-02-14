import java.util.*;
import java.util.stream.*;

//ABC445B
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    String[] sArray = new String[n];
    int maxSLength = 0;
    for (int i = 0; i < n; i++) {
      String s = scanner.next();
      sArray[i] = s;
      int sLength = s.length();
      if (maxSLength < sLength) {
        maxSLength = sLength;
      }
    }
    scanner.close();
    for (int i = 0; i < n; i++) {
      String currentS = sArray[i];
      int currentSLength = currentS.length();
      if (currentSLength == maxSLength) {
        System.out.println(currentS);
      } else {
        String dot =".".repeat((maxSLength - currentSLength) / 2);
        System.out.println(dot + currentS + dot);
      }
    }
  }
}