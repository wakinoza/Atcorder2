
import java.util.*;
import java.util.stream.*;
import java.io.*;

// A13
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer firstLine = new StringTokenizer(br.readLine());
    final int N = Integer.parseInt(firstLine.nextToken());
    final int K = Integer.parseInt(firstLine.nextToken());
    int[] aArray = new int[N];
    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      aArray[i] = Integer.parseInt(st.nextToken());
    }
    br.close();
    long totalCount = 0;
    int r = 0;
    for (int l = 0; l < N ; l++) {
      while (r + 1< N && aArray[r + 1] - aArray[l] <= K) {
        r++;
      }
      if (r > l) {
        totalCount += (r - l);
      }
    }
    System.out.println(totalCount);
  }
}