import java.util.*;
import java.util.stream.*;

//ABC381C
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    char[] sArray = scanner.next().toCharArray();
    scanner.close();
    int maxSubstringLength = 0;
    for (int i = 0; i < n; i++) {
      if (sArray[i] == '/') {
        int substringLength = 1;
        int left = i - 1;
        int right = i + 1;
        while (left >= 0 && right < n) {
          if (sArray[left] != '1') {
            break;
          }
          if (sArray[right] != '2') {
            break;
          }
          substringLength += 2;
          right++;
          left--;
        }
        if (maxSubstringLength < substringLength) {
          maxSubstringLength = substringLength;
        }
      }
    }
    System.out.println(maxSubstringLength);
  }
}
