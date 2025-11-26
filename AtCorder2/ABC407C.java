import java.util.*;
import java.util.stream.*;

//ABC
//public class ABC   {
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char[] sArray = scanner.next().toCharArray();
    scanner.close();
    int sLength = sArray.length;
    char nextC = sArray[sLength - 1];
    long buttonPushTotal =(nextC - '0') + sLength;
    for (int i = sLength - 2; i >= 0 ; i--) {
      char currentC = sArray[i];
      int diff = currentC - nextC;
      if (diff > 0) {
        buttonPushTotal += diff;
      } else if (diff < 0){
        buttonPushTotal += (10 + diff);
      }
      nextC = currentC;
    }
    System.out.println(buttonPushTotal);
  }
}
