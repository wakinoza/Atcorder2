
import java.util.*;
import java.util.stream.*;
import java.io.*;

// B20
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final char[] S = br.readLine().trim().toCharArray();
    final char[] T = br.readLine().trim().toCharArray();
    br.close();

    int sLength = S.length;
    int tLength = T.length;
    int[][] dp = new int[sLength + 1][tLength + 1];
    for (int i = 0; i <= tLength; i++) {
      dp[0][i] = i;
    }
    for (int i = 1; i <= sLength; i++) {
      dp[i][0] = i;
    }
    for (int i = 0; i <= sLength; i++) {
      for (int j = 0; j <= tLength; j++) {
        if (i >= 1 && j >= 1 && S[i - 1] == T[j - 1]) {
          dp[i][j] = Math.min(dp[i - 1][j] + 1, Math.min(dp[i][j - 1] + 1, dp[i - 1][j - 1] ));
        } else if (i >= 1 && j >= 1) {
          dp[i][j] = Math.min(dp[i - 1][j] + 1, Math.min(dp[i][j - 1] + 1, dp[i - 1][j - 1] + 1));
        }
      }
    }
    System.out.println(dp[sLength][tLength]);
  }
}
