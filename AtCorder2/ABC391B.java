import java.util.*;
import java.util.stream.*;

//ABC391B
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    boolean[][] isBlackSGrid = new boolean[n][n];
    for (int i = 0; i < n; i++) {
      char[] sLine = scanner.next().toCharArray();
      for (int j = 0; j < n; j++) {
        if (sLine[j] == '#') {
          isBlackSGrid[i][j] = true;
        } else {
          isBlackSGrid[i][j] = false;
        }
      }
    }
    boolean[][] isBlackTGrid = new boolean[m][m];
    for (int i = 0; i < m; i++) {
      char[] tLine = scanner.next().toCharArray();
      for (int j = 0; j < m; j++) {
        if (tLine[j] == '#') {
          isBlackTGrid[i][j] = true;
        } else {
          isBlackTGrid[i][j] = false;
        }
      }
    }
    scanner.close();

    int diff = n - m;
    for (int i = 0; i <= diff; i++) {
      for (int j = 0; j <= diff; j++) {
        boolean isEqual = true;
        for (int k = 0; k < m; k++) {
          if (!isEqual) {
            break;
          }
          for (int l = 0; l < m; l++) {
            if (isBlackSGrid[i + k][j + l] != isBlackTGrid[k][l] ) {
              isEqual = false;
              break;
            }
          }
        }
        if (isEqual) {
          System.out.println((i + 1) + " " + (j + 1));
          return;
        }
      }
    }
  }
}
