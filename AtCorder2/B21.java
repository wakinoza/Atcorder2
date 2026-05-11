
import java.util.*;
import java.util.stream.*;
import java.io.*;

// B21
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final int N = Integer.parseInt(br.readLine().trim());
    char[] S = br.readLine().trim().toCharArray();
    br.close();
    int[][] dp = new int[N + 1][N + 1];
    for (int i = 0; i < N; i++) {
      dp[i][i] = 1;
    }

    for (int LEN = 2; LEN <= N; LEN++) {
      for (int l = 0; l <= N - LEN ; l++) {
        int r = l + LEN - 1;
        if (S[l] == S[r]) {
          if (LEN == 2) {
            dp[l][r] = 2;
          } else {
            dp[l][r] = dp[l + 1][r - 1] + 2;
          }
        } else {
          dp[l][r] = Math.max(dp[l + 1][r], dp[l][r - 1]);
        }
      }
    }
    System.out.println(dp[0][N - 1]);
  }
}