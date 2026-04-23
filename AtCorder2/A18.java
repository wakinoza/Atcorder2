
import java.util.*;
import java.util.stream.*;
import java.io.*;

// A18
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer firstLine = new StringTokenizer(br.readLine());
    final int N = Integer.parseInt(firstLine.nextToken());
    final int S = Integer.parseInt(firstLine.nextToken());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] aArray = new int[N + 1];
    for (int i = 1; i <= N; i++) {
      aArray[i] = Integer.parseInt(st.nextToken());
    }
    br.close();
    boolean[][] dp = new boolean[N + 1][S + 1];
    Arrays.fill(dp[0], false);
    dp[0][0] = true;
    for (int i = 1; i <= N; i++) {
      Arrays.fill(dp[i], false);
      for (int j = 0; j <= S; j++) {
        if (dp[i - 1][j]) {
          dp[i][j] = true;
          int nextSum = j + aArray[i];
          if (nextSum == S) {
            System.out.println("Yes");
            return;
          } else if (nextSum < S)  {
            dp[i][nextSum] = true;
          }
        }
      }
    }
    System.out.println("No");
  }
}