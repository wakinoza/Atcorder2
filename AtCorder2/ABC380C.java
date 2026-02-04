import java.util.*;
import java.util.stream.*;

//ABC
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int k = scanner.nextInt();
    String s = scanner.next();
    scanner.close();

    char[] sArray = s.toCharArray();
    boolean isOneSegment = false;
    int oneSegmentCount = 0;
    int prevKSegmentLastIndex = 0;
    int kSegmentStartIndex = 0;
    int kSegmentLastIndex = 0;
    for (int i = 0; i < n; i++) {
      char number = sArray[i];
      if (number == '1') {
        if (!isOneSegment) {
          oneSegmentCount++;
          if (oneSegmentCount == k) {
            kSegmentStartIndex = i;
          }
        }
        isOneSegment = true;
      } else {
        if (oneSegmentCount == k - 1 && isOneSegment) {
          prevKSegmentLastIndex = i - 1;
        }
        if (oneSegmentCount == k && isOneSegment) {
          kSegmentLastIndex = i - 1;
        }
        isOneSegment = false;
      }
    }
    if (oneSegmentCount == k && isOneSegment) {
      kSegmentLastIndex = n - 1;
    }
    String moveOneSegment = "1".repeat(kSegmentLastIndex - kSegmentStartIndex + 1);
    String moveZeroSegment = "0".repeat(kSegmentStartIndex - prevKSegmentLastIndex - 1);
    String answer = s.substring(0,prevKSegmentLastIndex + 1) + moveOneSegment + moveZeroSegment + s.substring(kSegmentLastIndex + 1);
    System.out.println(answer);
  }
}