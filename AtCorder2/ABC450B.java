
import java.util.*;
import java.util.stream.*;
import java.io.*;

// ABC450B
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine().trim());
    int[][] costs = new int[n][n + 1];
    for (int i = 1; i < n; i++) {
      Arrays.fill(costs[i],0);
      StringTokenizer st = new StringTokenizer(br.readLine());
      for (int j = i + 1; j <= n; j++) {
        costs[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    br.close();
    String answer = "No";
    boolean needCheck = true;
    for (int i = 1; i < n - 1; i++) {
      if (!needCheck) {
        break;
      }
      for (int j = i + 2; j <= n; j++) {
        if (!needCheck) {
          break;
        }
        int acCost = costs[i][j];
        for (int k = i + 1; k < j; k++) {
          int abCost = costs[i][k];
          int bcCost = costs[k][j];
          if (acCost > abCost + bcCost) {
            answer = "Yes";
            needCheck = false;
            break;
          }
        }
      }
    }
    System.out.println(answer);
  }
}
