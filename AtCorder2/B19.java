
import java.util.*;
import java.util.stream.*;
import java.io.*;

// B19
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer firstLine = new StringTokenizer(br.readLine());
    final int N = Integer.parseInt(firstLine.nextToken());
    final int W = Integer.parseInt(firstLine.nextToken());
    int[] wArray = new int[N + 1];
    int[] vArray = new int[N + 1];
    for (int i = 1; i <= N; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      wArray[i] = Integer.parseInt(st.nextToken());
      vArray[i] = Integer.parseInt(st.nextToken());
    }
    br.close();
    final long INF = 1_000_000_000_000L;
    final int MAX_V_TOTAL = N * 1000;
    long[] dp = new long[MAX_V_TOTAL + 1];
    Arrays.fill(dp, INF);
    dp[0] = 0L;
    for (int i = 1; i <= N; i++) {
      int currentV = vArray[i];
      for (int v = MAX_V_TOTAL; v >= currentV; v--) {
        if (dp[v - currentV] != -1) {
          dp[v] = Math.min(dp[v], dp[v - currentV] + wArray[i]);
        }
      }
    }
    int answer = 0;
    for (int v = 0; v <= MAX_V_TOTAL; v++) {
      if (dp[v] <= W) {
        answer = v;
      }
    }
    System.out.println(answer);
  }
}
