
import java.util.*;
import java.util.stream.*;
import java.io.*;

// A19
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer firstLine = new StringTokenizer(br.readLine());
    final int N = Integer.parseInt(firstLine.nextToken());
    final int W = Integer.parseInt(firstLine.nextToken());
    int[] wArray = new int[N + 1];
    long[] vArray = new long[N + 1];
    for (int i = 1; i <= N; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      wArray[i] = Integer.parseInt(st.nextToken());
      vArray[i] = Long.parseLong(st.nextToken());
    }
    br.close();

    long answer = 0L;
    long[][] vTotal = new long[N + 1][W + 1];
    Arrays.fill(vTotal[0], -1L);
    vTotal[0][0] = 0L;
    for (int i = 1; i <= N; i++) {
      Arrays.fill(vTotal[i], -1L);
      for (int w = 0; w <= W; w++) {
        long prevTotal = vTotal[i - 1][w];
        if (prevTotal >= 0) {
          vTotal[i][w] = Math.max(vTotal[i][w], prevTotal);
          if (answer < vTotal[i][w]) {
            answer = vTotal[i][w];
          }
          int nextW = w + wArray[i];
          if (nextW <= W) {
            vTotal[i][nextW] = Math.max(vTotal[i][nextW], prevTotal + vArray[i]);
            if (answer < vTotal[i][nextW]) {
              answer = vTotal[i][nextW];
            }
          }
        }
      }
    }
    System.out.println(answer);
  }
}