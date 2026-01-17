import java.util.*;
import java.util.stream.*;
import java.io.*;


// ABC441C
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st1 = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st1.nextToken());
    int k = Integer.parseInt(st1.nextToken());
    long x = Long.parseLong(st1.nextToken());

    StringTokenizer st2 = new StringTokenizer(br.readLine());
    long[] cups = new long[n];
    for (int i = 0; i < n; i++) {
      cups[i] = Long.parseLong(st2.nextToken());
    }
    br.close();

    Arrays.sort(cups);
    int water= n - k;
    long guaranteedSakeTotal = 0;

    for (int i = 0; i < k; i++) {
      guaranteedSakeTotal += cups[k - 1 - i];

      if (guaranteedSakeTotal >= x) {
        System.out.println(water + i + 1);
        return;
      }
    }
    System.out.println(-1);
  }
}
