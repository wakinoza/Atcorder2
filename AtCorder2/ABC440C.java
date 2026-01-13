import java.util.*;
import java.util.stream.*;
import java.io.*;

//ABC440C
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String firstLine = br.readLine();
    int t = Integer.parseInt(firstLine.trim());

    for (int i = 0; i < t; i++) {
      StringTokenizer nwLine = new StringTokenizer(br.readLine());
      int n = Integer.parseInt(nwLine.nextToken());
      int w = Integer.parseInt(nwLine.nextToken());
      int w2 = w * 2;
      StringTokenizer cLine = new StringTokenizer(br.readLine());

      long[] bucket = new long[w2];
      Arrays.fill(bucket, 0L);
      for (int j = 1; j <= n; j++) {
        long c = Long.parseLong(cLine.nextToken());
        bucket[j % w2] += c;
      }

      long currentSum = 0;
      for (int j = 0; j < w; j++) {
        currentSum += bucket[j];
      }

      long minCost = currentSum;
      for (int j = 0; j < w2; j++) {
        currentSum -= bucket[j % w2];
        currentSum += bucket[(j + w) % w2];
        if (currentSum < minCost) {
          minCost = currentSum;
        }
      }
      System.out.println(minCost);
    }
    br.close();
  }
}