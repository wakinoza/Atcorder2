
import java.util.*;
import java.util.stream.*;
import java.io.*;

// A21
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer firstLine = new StringTokenizer(br.readLine());
    final int N = Integer.parseInt(firstLine.nextToken());
    int[] pArray = new int[N + 1];
    int[] aArray = new int[N + 1];
    for (int i = 1; i <= N; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      pArray[i] = Integer.parseInt(st.nextToken());
      aArray[i] = Integer.parseInt(st.nextToken());
    }
    br.close();
    int[][] dp = new int[N + 1][N + 1];
    dp[1][N] = 0;
    int answer = 0;
    for (int LEN = N - 2; LEN >= 0; LEN--) {
      for (int l = 1; l <= N - LEN; l++) {
        int r = l + LEN;
        int score1 = 0;
        if (l <= pArray[l - 1] && pArray[l - 1] <= r) {
          score1 = aArray[l - 1];
        }
        int score2 = 0;
        if (r + 1 <= N && l <= pArray[r + 1] && pArray[r + 1] <= r) {
          score2 = aArray[r + 1];
        }

        if (l == 1) {
          dp[l][r] = dp[l][r + 1] + score2;
        } else if(r == N) {
          dp[l][r] = dp[l - 1][r] + score1;
        } else {
          dp[l][r] = Math.max(dp[l][r + 1] + score2,dp[l - 1][r] + score1);
        }

        if (dp[l][r] > answer) {
          answer = dp[l][r];
        }
      }
    }
    System.out.println(answer);
  }
}
