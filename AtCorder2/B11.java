
import java.util.*;
import java.util.stream.*;
import java.io.*;

// B11
public class Main {
  private static int binarySearch(int[] array, int target) {
    int left = 1;
    int right = array.length - 1;
    int mid;
    int answer = 0;
    while (left <= right) {
      mid = left + (right - left) / 2;

      if (array[mid] < target) {
        answer = mid;
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    return answer;
  }
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine().trim());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] aArray = new int[n + 1];
    for (int i = 1; i <= n; i++) {
      aArray[i] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(aArray);
    int q = Integer.parseInt(br.readLine().trim());
    for (int i = 0; i < q; i++) {
      int x = Integer.parseInt(br.readLine().trim());
      System.out.println(binarySearch(aArray, x));
    }
    br.close();
  }
}
