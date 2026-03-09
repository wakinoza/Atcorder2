
import java.util.*;
import java.util.stream.*;
import java.io.*;

// A08
public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer hw = new StringTokenizer(br.readLine());
    int h = Integer.parseInt(hw.nextToken());
    int w = Integer.parseInt(hw.nextToken());
    int[][] grids = new int[h][w];
    for (int i = 0; i < h; i++){
      StringTokenizer xLine = new StringTokenizer(br.readLine());
      for (int j = 0; j < w; j++) {
        if (j == 0) {
          grids[i][0] = Integer.parseInt(xLine.nextToken());
        } else {
          grids[i][j] = grids[i][j - 1] + Integer.parseInt(xLine.nextToken());
        }
      }
    }
    for (int j = 0; j < w; j++) {
      for (int i = 1; i < h; i++) {
        grids[i][j] += grids[i - 1][j];
      }
    }
    int q = Integer.parseInt(br.readLine().trim());
    for (int i = 0; i < q; i++) {
      StringTokenizer abcd = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(abcd.nextToken()) - 1;
      int b = Integer.parseInt(abcd.nextToken()) - 1;
      int c = Integer.parseInt(abcd.nextToken()) - 1;
      int d = Integer.parseInt(abcd.nextToken()) - 1;
      int answer = 0;
      if (a == 0 && b == 0) {
        answer = grids[c][d];
      } else if (a > 0 && b == 0) {
        answer = grids[c][d] - grids[a - 1][d];
      } else if (a == 0 && b > 0) {
        answer = grids[c][d] - grids[c][b - 1];
      } else {
        answer = grids[c][d] - grids[a - 1][d] - grids[c][b - 1] + grids[a - 1][b - 1];
      }
      System.out.println(answer);
    }
    br.close();
  }
}
