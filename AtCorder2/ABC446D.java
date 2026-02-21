
import java.util.*;
import java.util.stream.*;
import java.io.*;

// ABC446D
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String firstLine = br.readLine();
    int n = Integer.parseInt(firstLine.trim());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] aArray = new int[n];
    for (int i = 0; i < n; i++) {
      aArray[i] = Integer.parseInt(st.nextToken());
    }
    br.close();
    int[] dp = new int[n];
    Map<Integer, Integer> aAndIndex = new HashMap<>();
    int answer = 1;
    for (int i = 0; i < n; i++) {
      int a = aArray[i];
      if (aAndIndex.containsKey(a - 1)) {
        int currentMax = dp[aAndIndex.get(a - 1)] + 1;
        dp[i] = currentMax;
        if (answer < currentMax) {
          answer = currentMax;
        }
      } else {
        dp[i] = 1;
      }
      aAndIndex.put(a, i);
    }
    System.out.println(answer);
  }
}