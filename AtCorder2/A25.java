
import java.util.*;
import java.util.stream.*;
import java.io.*;

// A25 DP問題
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer firstLine = new StringTokenizer(br.readLine());
    final int H = Integer.parseInt(firstLine.nextToken());
    final int W = Integer.parseInt(firstLine.nextToken());
    boolean[][] canWalk = new boolean[H][W];
    for (int i = 0; i < H; i++) {
      char[] line = br.readLine().trim().toCharArray();
      for (int j = 0; j < W; j++) {
        if (line[j] == '.') {
          canWalk[i][j] = true;
        } else {
          canWalk[i][j] = false;
        }
      }
    }
    br.close();
    long[][] patterns = new long[H][W];
    patterns[0][0] = 1L;
    for (int i = 1; i < W; i++) {
      patterns[0][i] = 0;
      if (canWalk[0][i - 1] && canWalk[0][i]) {
        patterns[0][i] = patterns[0][i - 1];
      }
    }
    for (int i = 1; i < H; i++) {
      patterns[i][0] = 0;
      if (canWalk[i - 1][0] && canWalk[i][0]) {
        patterns[i][0] = patterns[i - 1][0];
      }
    }
    for (int i = 1; i < H; i++) {
      for (int j = 1; j < W; j++) {
        long currentPattern = 0L;
        if  (canWalk[i - 1][j] && canWalk[i][j - 1]) {
          currentPattern = patterns[i - 1][j] + patterns[i][j - 1];
        } else if (canWalk[i - 1][j]) {
          currentPattern = patterns[i - 1][j];
        } else if (canWalk[i][j - 1]) {
          currentPattern = patterns[i][j - 1];
        }
        patterns[i][j] = currentPattern;
      }
    }
    System.out.println(patterns[H - 1][W - 1]);
  }
}
