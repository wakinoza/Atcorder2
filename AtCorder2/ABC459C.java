
import java.util.*;
import java.util.stream.*;
import java.io.*;

// ABC459C
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer firstLine = new StringTokenizer(br.readLine());
    final int N = Integer.parseInt(firstLine.nextToken());
    final int Q = Integer.parseInt(firstLine.nextToken());
    int[] blocks = new int[N + 1];
    Arrays.fill(blocks, 0);
    int[] cumulativeSum = new int[Q + 1];
    Arrays.fill(cumulativeSum,N);
    int startIndex = 0;
    for (int i = 0; i < Q; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int query = Integer.parseInt(st.nextToken());
      if (query == 1) {
        int x = Integer.parseInt(st.nextToken());
        int prevBlock = blocks[x];
        blocks[x]++;
        cumulativeSum[prevBlock]--;

        if (cumulativeSum[startIndex] == 0) {
          startIndex++;
        }
      } else {
        int y = Integer.parseInt(st.nextToken());
        int answer = 0;
        if (y + startIndex - 1 <= Q) {
          answer = N - cumulativeSum[y + startIndex - 1];
        }
        System.out.println(answer);
      }
    }
    br.close();
  }
}