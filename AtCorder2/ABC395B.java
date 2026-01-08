import java.util.*;
import java.util.stream.*;

//ABC
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    scanner.close();
    char[][] grids = new char[n][n];
    int middle = (n + 1) / 2;
    for (int i = 0; i <= middle; i++ ) {
      char color = (i % 2 == 0) ? '#' : '.';
      for (int j = i; j < n - i; j++) {
        grids[i][j] = color;
        grids[n - i - 1][j] = color;
        grids[j][i] = color;
        grids[j][n - i - 1] = color;
      }
    }
    for (char[] line :grids) {
      StringBuilder answer = new StringBuilder();
      for (char color : line) {
        answer.append(color);
      }
      System.out.println(answer.toString());
    }
  }
}
