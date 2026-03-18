
import java.util.*;
import java.util.stream.*;
import java.io.*;

// A11
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer nx = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(nx.nextToken());
    int x = Integer.parseInt(nx.nextToken());
    int[] aArray = new int[n + 1];
    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 1; i <= n; i++) {
      aArray[i] = Integer.parseInt(st.nextToken());
    }
    br.close();
    int left = 1;
    int right = n;
    while (left <= right) {
      int mid = (left + right) /2;
      if (aArray[mid] == x) {
        System.out.println(mid);
        return;
      } else if (aArray[mid] > x) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
    System.out.println(-1);
  }
}