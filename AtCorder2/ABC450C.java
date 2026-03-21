
import java.util.*;
import java.util.stream.*;
import java.io.*;

// ABC4450C
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer firstLine = new StringTokenizer(br.readLine());
    int h = Integer.parseInt(firstLine.nextToken());
    int w = Integer.parseInt(firstLine.nextToken());
    boolean[][] isWhite = new boolean[h][w];
    for (int i = 0; i < h; i++) {
      char[] s = br.readLine().trim().toCharArray();
      for (int j = 0; j < w; j++) {
        char current = s[j];
        if (current == '.') {
          isWhite[i][j] = true;
        } else {
          isWhite[i][j] = false;
        }
      }
    }
    br.close();
    boolean[][] checked = new boolean[h][w];
    int answer = 0;
    Deque<Integer> yIndexStack = new ArrayDeque<>();
    Deque<Integer> xIndexStack = new ArrayDeque<>();
    int[] dy = { -1, 1, 0, 0 };
    int[] dx = { 0, 0, -1, 1 };
    for (int i = 1; i < h - 1; i++) {
      for (int j = 1; j < w - 1; j++) {
        if (isWhite[i][j] && !checked[i][j]) {
          boolean needCount = true;
          yIndexStack.add(i);
          xIndexStack.add(j);
          checked[i][j] = true;
          while (!yIndexStack.isEmpty()) {
            int y = yIndexStack.pollLast();
            int x = xIndexStack.pollLast();
            for (int d = 0; d < 4; d++) {
              int nextY = y + dy[d];
              int nextX = x + dx[d];
              if (isWhite[nextY][nextX] && !checked[nextY][nextX]) {
                if (nextY == 0 || nextY == h - 1 || nextX == 0 || nextX == w - 1) {
                  needCount = false;
                  checked[nextY][nextX] = true;
                } else {
                  yIndexStack.add(nextY);
                  xIndexStack.add(nextX);
                  checked[nextY][nextX] = true;
                }
              }
            }
          }
          if (needCount) {
            answer++;
          }
        }
      }
    }
    System.out.println(answer);
  }
}
