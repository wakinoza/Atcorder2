
import java.util.*;
import java.util.stream.*;
import java.io.*;

// B16
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final int N = Integer.parseInt(br.readLine().trim());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] hArray = new int[N];
    for (int i = 0; i < N; i++) {
      hArray[i] = Integer.parseInt(st.nextToken());
    }
    br.close();
    int[] dp = new int[N];
    dp[0] = 0;
    dp[1] = Math.abs(hArray[1] - hArray[0]);
    for (int i = 2; i < N; i++) {
      int prev = dp[i - 1] + Math.abs(hArray[i - 1] - hArray[i]);
      int prevPrev = dp[i - 2] + Math.abs(hArray[i - 2] - hArray[i]);
      dp[i] = Math.min(prev, prevPrev);
    }
    System.out.println(dp[N - 1]);
  }
}
