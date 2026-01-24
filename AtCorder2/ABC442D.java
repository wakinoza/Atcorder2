import java.util.*;
import java.util.stream.*;
import java.io.*;

// ABC442D
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer firstLine = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(firstLine.nextToken());
    int q = Integer.parseInt(firstLine.nextToken());

    int[] aArray = new int[n + 1];
    long[] aTotals = new long[n + 1];
    aTotals[0] = 0;
    StringTokenizer aLine = new StringTokenizer(br.readLine());
    for (int i = 1; i <= n; i++) {
      int a = Integer.parseInt(aLine.nextToken());
      aArray[i] = a;
      aTotals[i] = aTotals[i - 1] + a;
    }

    for (int i = 0; i < q; i++){
      StringTokenizer queryLine = new StringTokenizer(br.readLine());
      int query = Integer.parseInt(queryLine.nextToken());
      if (query == 1) {
        int x = Integer.parseInt(queryLine.nextToken());
        int diff = aArray[x] - aArray[x + 1];
        int temp = aArray[x];
        aArray[x] = aArray[x + 1];
        aArray[x + 1] = temp;
        aTotals[x] -= diff;
      } else {
        int l = Integer.parseInt(queryLine.nextToken());
        int r = Integer.parseInt(queryLine.nextToken());
        System.out.println(aTotals[r] - aTotals[l - 1]);
      }
    }
    br.close();
  }
}