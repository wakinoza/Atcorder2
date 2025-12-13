import java.util.*;
import java.util.stream.*;

//ABC436
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    scanner.close();
    int[][] grids = new int[n][n];
    for (int i = 0; i < n; i ++) {
      for (int j = 0; j < n; j ++) {
        grids[i][j] = 0;
      }
    }
    int prevRIndex = 0;
    int prevCIndex = (n - 1) / 2;
    int currentK = 1;
    grids[prevRIndex][prevCIndex] = currentK;
    for (int i = 1; i <= (n * n - 1); i++) {
      currentK++;
      int nextRIndex = (prevRIndex - 1) % n;
      int nextCIndex = (prevCIndex + 1) % n;
      if (nextRIndex < 0) {
        nextRIndex += n;
      }
      if (nextCIndex < 0) {
        nextCIndex += n;
      }
      if (grids[nextRIndex][nextCIndex] != 0) {
        nextRIndex = (prevRIndex + 1) % n;
        nextCIndex = prevCIndex;
        if (nextRIndex < 0) {
          nextRIndex += n;
        }
        if (nextCIndex < 0) {
          nextCIndex += n;
        }
      }
      grids[nextRIndex][nextCIndex] = currentK;
      prevRIndex = nextRIndex;
      prevCIndex = nextCIndex;
    }
    for (int[] line :grids) {
      String result = Arrays.stream(line)
          .mapToObj(String::valueOf)
          .collect(Collectors.joining(" "));
      System.out.println(result);
    }
  }
}
