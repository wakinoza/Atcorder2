
import java.util.*;
import java.util.stream.*;
import java.io.*;

// B08
public class Main {
  public static void main(String[] args) throws IOException {
    final int MAX_LIMIT = 1501;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine().trim());
    int[][] grids = new int[MAX_LIMIT][MAX_LIMIT];
    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int x = Integer.parseInt(st.nextToken());
      int y = Integer.parseInt(st.nextToken());
      grids[x][y]++;
    }
    int[][] gridSums = new int[MAX_LIMIT][MAX_LIMIT];
    for (int i = 1; i < MAX_LIMIT; i++) {
      for (int j = 1; j < MAX_LIMIT; j++) {
        if (j == 1) {
          gridSums[i][j] = grids[i][j];
        } else {
          gridSums[i][j] = grids[i][j] + gridSums[i][j - 1];
        }
      }
    }
    for (int j = 0; j < MAX_LIMIT; j++) {
      for (int i = 1; i < MAX_LIMIT; i++) {
        gridSums[i][j] += gridSums[i - 1][j];
      }
    }
    int q = Integer.parseInt(br.readLine().trim());
    for (int i = 0; i < q; i++) {
      StringTokenizer abcd = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(abcd.nextToken());
      int b = Integer.parseInt(abcd.nextToken());
      int c = Integer.parseInt(abcd.nextToken());
      int d = Integer.parseInt(abcd.nextToken());
      int answer = 0;
      if (a == 1 && b == 1) {
        answer = gridSums[c][d];
      } else if (a > 1 && b == 1) {
        answer = gridSums[c][d] - gridSums[a - 1][d];
      } else if (a == 1 && b > 1) {
        answer = gridSums[c][d] - gridSums[c][b - 1];
      } else {
        answer = gridSums[c][d] - gridSums[a - 1][d] - gridSums[c][b - 1] + gridSums[a - 1][b - 1];
      }
      System.out.println(answer);
    }
    br.close();
  }
}