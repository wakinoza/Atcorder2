import java.util.*;
import java.util.stream.*;

//ABC389C
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int q = scanner.nextInt();
    long[] snakeLengths = new long[q];
    long[] cumulativeSum = new long[q];
    int firstIndex = 0;
    int lastIndex = 0;
    long removeLengthTotal = 0;
    for (int i = 0; i < q; i++) {
      int query = scanner.nextInt();
      if (query == 1) {
        long length = scanner.nextLong();
        snakeLengths[lastIndex] = length;
        if (lastIndex == 0) {
          cumulativeSum[lastIndex] = 0;
        } else {
          cumulativeSum[lastIndex] = cumulativeSum[lastIndex - 1] + snakeLengths[lastIndex - 1];
        }
        lastIndex++;

      } else if(query == 2) {
        removeLengthTotal += snakeLengths[firstIndex];
        firstIndex++;

      } else {
        int k = scanner.nextInt();
        int targetIndex = firstIndex + (k - 1);
        System.out.println(cumulativeSum[targetIndex] - removeLengthTotal);
      }
    }
    scanner.close();
  }
}