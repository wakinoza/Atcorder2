
import java.util.*;
import java.util.stream.*;
import java.io.*;

// ABC462B
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine().trim());
    Map<Integer, List<Integer>> gifts = new TreeMap<>();
    for (int i = 1; i <= n; i++) {
      gifts.put(i, new ArrayList<Integer>());
    }
    for (int i = 1; i <= n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int k = Integer.parseInt(st.nextToken());
      for (int j = 0; j < k; j++) {
        int a = Integer.parseInt(st.nextToken());
        gifts.get(a).add(i);
      }
    }
    br.close();

    for (List<Integer> list : gifts.values()) {
      if (list.isEmpty()) {
        System.out.print(0);
      } else {
        int size = list.size();
        System.out.print(size);
        for (int num : list) {
          System.out.print(" " + num);
        }
      }
      System.out.println();
    }
  }
}
