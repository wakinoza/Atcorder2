
import java.util.*;
import java.util.stream.*;
import java.io.*;

// ABC451B
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer firstLine = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(firstLine.nextToken());
    int M = Integer.parseInt(firstLine.nextToken());
    int[] currentTotals = new int[M + 1];
    Arrays.fill(currentTotals,0);
    int[] nextTotals = new int[M + 1];
    Arrays.fill(nextTotals, 0);
    for (int i = 0; i < N; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      currentTotals[Integer.parseInt(st.nextToken())]++;
      nextTotals[Integer.parseInt(st.nextToken())]++;
    }
    br.close();

    for (int i = 1; i <= M ;i++) {
      System.out.println(nextTotals[i] - currentTotals[i]);
    }
  }
}