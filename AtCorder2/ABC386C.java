import java.util.*;
import java.util.stream.*;

//ABC
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int k = scanner.nextInt();
    char[] sArray = scanner.next().toCharArray();
    char[] tArray = scanner.next().toCharArray();
    scanner.close();
    int sLength = sArray.length;
    int tLength = tArray.length;

    if (Math.abs(sLength - tLength) >= 2) {
      System.out.println("No");
      return;
    }
    boolean changed = false;
    if (sLength > tLength) {
      int sAddIndex = 0;
      for (int i = 0; i < tLength; i++) {
        if (sArray[i + sAddIndex] != tArray[i]) {
          if (sArray[i + 1] == tArray[i] && !changed) {
            sAddIndex++;
            changed = true;
          } else {
            System.out.println("No");
            return;
          }
        }
      }
    } else if (sLength < tLength) {
      int tAddIndex = 0;
      for (int i = 0; i < sLength; i++) {
        if (sArray[i] != tArray[i + tAddIndex]) {
          if (sArray[i] == tArray[i + 1] && !changed) {
            tAddIndex++;
            changed = true;
          } else {
            System.out.println("No");
            return;
          }
        }
      }
    } else {
      for (int i = 0; i < sLength; i++) {
        if (sArray[i] != tArray[i]) {
          if (!changed) {
            changed = true;
          } else {
            System.out.println("No");
            return;
          }
        }
      }
    }
    System.out.println("Yes");
  }
}