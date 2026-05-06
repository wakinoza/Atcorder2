
import java.util.*;
import java.util.stream.*;
import java.io.*;

// A20
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final char[] S = br.readLine().trim().toCharArray();
    final char[] T = br.readLine().trim().toCharArray();
    br.close();
    int sLength = S.length;
    int tLength = T.length;
    int[][] dp = new int[sLength + 1][tLength + 1];
    for (int i = 0; i <= sLength; i++) {
      for (int j = 0; j <= tLength; j++) {
        if (i >= 1 && j >= 1 && S[i - 1] == T[j - 1]) {
          dp[i][j] = Math.max(dp[i - 1][j], Math.max(dp[i][j - 1], dp[i - 1][j - 1] + 1));
        } else if (i >= 1 && j >= 1) {
          dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
        } else if (i >= 1) {
          dp[i][j] = dp[i - 1][j];
        } else if (j >= 1) {
          dp[i][j] = dp[i][j - 1];
        }
      }
    }
    System.out.println(dp[sLength][tLength]);
  }
}
