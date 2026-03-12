
import java.util.*;
import java.util.stream.*;
import java.io.*;

// A09
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer hw = new StringTokenizer(br.readLine());
    int h = Integer.parseInt(hw.nextToken());
    int w = Integer.parseInt(hw.nextToken());
    int n = Integer.parseInt(hw.nextToken());
    int[][] grids = new int[h][w];
    for (int i = 0; i < n; i++) {
      StringTokenizer abcd = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(abcd.nextToken()) - 1;
      int b = Integer.parseInt(abcd.nextToken()) - 1;
      int c = Integer.parseInt(abcd.nextToken());
      int d = Integer.parseInt(abcd.nextToken());
      grids[a][b] += 1;
      if (d<= w - 1 && c <= h - 1) {
        grids[c][d] += 1;
      }
      if (d <= w - 1) {
        grids[a][d] -= 1;
      }
      if (c <= h - 1) {
        grids[c][b] -= 1;
      }
    }
    for (int i = 0; i < h; i++) {
      for (int j = 1; j < w; j++) {
        grids[i][j] += grids[i][j - 1];
      }
    }
    for (int i = 0; i < w; i++) {
      for (int j = 1; j < h; j++) {
        grids[j][i] += grids[j - 1][i];
      }
    }
    br.close();
    for (int[] line : grids) {
      String result = Arrays.stream(line)
          .mapToObj(String::valueOf)
          .collect(Collectors.joining(" "));
      System.out.println(result);
    }
  }
}