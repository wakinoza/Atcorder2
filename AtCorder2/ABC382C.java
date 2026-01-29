import java.util.*;
import java.util.stream.*;
import java.io.*;

//ABC382C
public class Main {
  private static int binarySearch(List<Integer> list, int b) {
        int left = 0;
        int right = list.size() - 1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (list.get(mid) <= b) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
  }
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer firstLine = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(firstLine.nextToken());
    int m = Integer.parseInt(firstLine.nextToken());

    StringTokenizer a = new StringTokenizer(br.readLine());
    List<Integer> effectiveA = new ArrayList<>();
    List<Integer> personIndex = new ArrayList<>();
    int currentMin = Integer.MAX_VALUE;
    for (int i = 1; i <= n; i++) {
      int currentA = Integer.parseInt(a.nextToken());
      if (currentMin > currentA) {
        effectiveA.add(currentA);
        personIndex.add(i);
        currentMin = currentA;
      }
    }
    StringTokenizer b = new StringTokenizer(br.readLine());
    for (int i = 0; i < m; i++) {
      int currentB = Integer.parseInt(b.nextToken());
      int res = binarySearch(effectiveA, currentB);

      if (res == -1) {
        System.out.println("-1");
      } else {
        System.out.println(personIndex.get(res));
      }
    }
    br.close();
  }
}
