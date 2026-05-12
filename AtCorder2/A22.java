
import java.util.*;
import java.util.stream.*;
import java.io.*;

// ABC
public class Main {
  public static void main(String[] args) throws IOException {
    final int A_POINT = 100;
    final int B_POINT = 150;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final int N = Integer.parseInt(br.readLine().trim());
    StringTokenizer A = new StringTokenizer(br.readLine());
    int[] aArray = new int[N];
    for (int i = 1; i <= N - 1; i++) {
      aArray[i] = Integer.parseInt(A.nextToken());
    }
    StringTokenizer B = new StringTokenizer(br.readLine());
    int[] bArray = new int[N];
    for (int i = 1; i <= N - 1; i++) {
      bArray[i] = Integer.parseInt(B.nextToken());
    }
    br.close();

    long[] dp = new long[N + 1];
    Arrays.fill(dp, -1);
    dp[1] = 0L;
    for (int i = 1; i <= N - 1; i++) {
      if (dp[i] == -1)
        continue;
      int nextIndexA = aArray[i];
      dp[nextIndexA] = Math.max(dp[nextIndexA], dp[i] + A_POINT);
      int nextIndexB = bArray[i];
      dp[nextIndexB] = Math.max(dp[nextIndexB], dp[i] + B_POINT);
    }
    System.out.println(dp[N]);
  }
}
