
import java.util.*;
import java.util.stream.*;
import java.io.*;

// B18
public class Main {
  public static List<Integer> getCardNum(boolean[][] dp,int[] aArray, int i,int j) {
    List<Integer> answer = new ArrayList<>();
    answer.add(i);
    int prevI = i - 1;
    int prevJ = j;
    while (prevI > 0) {
      while (dp[prevI - 1][prevJ]) {
        prevI--;
      }
      answer.add(0,prevI);
      prevJ -= aArray[prevI];
      prevI--;
    }
    return answer;
  }
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
    int answer = -1;
    boolean[][] dp = new boolean[N + 1][S + 1];
    Arrays.fill(dp[0], false);
    dp[0][0] = true;
    for (int i = 1; i <= N; i++) {
      Arrays.fill(dp[i], false);
      for (int j = 0; j <= S; j++) {
        if (dp[i - 1][j]) {
          dp[i][j] = true;
          int nextSum = j + aArray[i];
          if (nextSum <= S) {
            dp[i][nextSum] = true;
          }
        }
      }
    }
    if (!dp[N][S]) {
      System.out.println("-1");
      return;
    }

    List<Integer> results = new ArrayList<>();
    int currentS = S;
    for (int i = N; i >= 1; i--) {
      if (dp[i - 1][currentS]) {
        continue;
      }
      if (currentS >= aArray[i] && dp[i - 1][currentS - aArray[i]]) {
        results.add(0,i);
        currentS -= aArray[i];
      }
    }
    System.out.println(results.size());
    String result = results.stream()
        .map(String::valueOf)
        .collect(Collectors.joining(" "));
    System.out.println(result);
  }
}