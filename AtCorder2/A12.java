
import java.util.*;
import java.util.stream.*;
import java.io.*;

// A12
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer firstLine = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(firstLine.nextToken());
    int k = Integer.parseInt(firstLine.nextToken());

    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] aArray = new int[n];
    for (int i = 0; i < n; i++) {
      aArray[i] = Integer.parseInt(st.nextToken());
    }

    br.close();
    int left = 1;
    int right = 1_000_000_000;
    int answer = 0;
    while (left <= right) {
      int mid = left + (right - left) / 2;
      long midTotal = 0;
      for (int a :aArray) {
        midTotal += (long)mid / a;
      }
      if (midTotal >= k) {
        answer = mid;
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
    System.out.println(answer);
  }
}
