
import java.util.*;
import java.util.stream.*;
import java.io.*;

// ABC446B
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer firstLine = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(firstLine.nextToken());
    int m = Integer.parseInt(firstLine.nextToken());
    int[][] wantList = new int[n + 1][m];

    for (int i = 1; i <= n; i++) {
      String lLine = br.readLine();
      int l = Integer.parseInt(lLine.trim());
      StringTokenizer st = new StringTokenizer(br.readLine());
      for (int j = 0; j < l; j++) {
        wantList[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    br.close();
    int[] answer = new int[n + 1];
    Arrays.fill(answer, 0);
    boolean[] decided = new boolean[m + 1];
    Arrays.fill(decided, false);
    for (int i = 1;  i <= n; i++) {
      for (int j = 0; j < m; j++) {
        int select = wantList[i][j];
        if (decided[select]) {
          continue;
        } else {
          answer[i] = select;
          decided[select] = true;
          break;
        }
      }
    }
    for (int i = 1; i <= n; i++) {
      System.out.println(answer[i]);
    }
  }
}