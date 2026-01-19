import java.util.*;
import java.util.stream.*;

//ABC388B
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int d = scanner.nextInt();
    int[] tArray = new int[n + 1];
    int[] lArray = new int[n + 1];
    for (int i = 1; i <= n; i++){
      tArray[i] = scanner.nextInt();
      lArray[i] = scanner.nextInt();
    }
    scanner.close();

    for (int i = 1; i <= d; i++) {
      int maxHeight = 0;
      for (int j = 1; j <= n; j++) {
        int currentHeight = tArray[j] * (lArray[j] + i);
        if (maxHeight < currentHeight) {
          maxHeight = currentHeight;
        }
      }
      System.out.println(maxHeight);
    }
  }
}