import java.util.*;
import java.util.stream.*;

//ABC438B
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    char[] sArray = scanner.next().toCharArray();
    char[] tArray = scanner.next().toCharArray();
    scanner.close();
    int distanceNM = n - m;
    int minTotal = Integer.MAX_VALUE;
    for (int i = 0; i <= distanceNM; i++) {
      int currentTotal = 0;
      for (int j = 0; j < m; j++) {
        int sInt = sArray[i + j] - '0';
        int tInt = tArray[j] - '0';
        int diff = sInt - tInt;
        if (diff < 0) {
          diff += 10;
        }
        currentTotal += diff;
      }
      if (minTotal > currentTotal) {
        minTotal = currentTotal;
      }
    }
    System.out.println(minTotal);
  }
}
