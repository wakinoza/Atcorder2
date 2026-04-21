
import java.util.*;
import java.util.stream.*;
import java.io.*;

// A15
public class Main {
  private static int binarySearch(int[] array, int target) {
    int left = 0;
    int right = array.length;
    int answer = -1;
    while (left <= right) {
      int mid = (left + right) /2;
      if (array[mid] ==  target) {
        answer = mid;
        break;
      } else if (array[mid] >  target) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
    return answer;
  }
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine().trim());
    int[] aArray = new int[n];
    Set<Integer> aSet = new HashSet<>();
    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < n; i++) {
      int a = Integer.parseInt(st.nextToken());
      aArray[i] = a;
      aSet.add(a);
    }
    br.close();
    int[] aSortUniqueArray = aSet.stream().sorted().mapToInt(Integer::intValue).toArray();
    int[] bArray = new int[n];
    for (int i = 0; i < n; i++) {
      int currentA = aArray[i];
      int currentAIndex = binarySearch(aSortUniqueArray, currentA);
      bArray[i] = currentAIndex + 1;
    }
    String result = Arrays.stream(bArray)
        .mapToObj(String::valueOf)
        .collect(Collectors.joining(" "));
    System.out.println(result);
  }
}