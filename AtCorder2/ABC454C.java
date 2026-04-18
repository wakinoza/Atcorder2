
import java.util.*;
import java.util.stream.*;
import java.io.*;

// ABC454C
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer firstLine = new StringTokenizer(br.readLine());
    final int N = Integer.parseInt(firstLine.nextToken());
    final int M = Integer.parseInt(firstLine.nextToken());
    Map<Integer, Set<Integer>> giveAndTakes = new HashMap<>();
    for (int i = 0; i < M; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      if (!giveAndTakes.containsKey(a)) {
        giveAndTakes.put(a, new HashSet<>());
      }
      giveAndTakes.get(a).add(b);
    }
    br.close();

    Set<Integer> items = new HashSet<>();
    items.add(1);
    ArrayDeque<Integer> stack = new ArrayDeque<>();
    boolean[] checked = new boolean[N + 1];
    Arrays.fill(checked, false);
    checked[1] = true;
    if (!giveAndTakes.containsKey(1)) {
      System.out.println(1);
      return;
    }
    for (Integer getItem : giveAndTakes.get(1)) {
      items.add(getItem);
      stack.add(getItem);
    }
    while (!stack.isEmpty()) {
      int currentItem = stack.pollLast();
      if (!checked[currentItem]) {
        checked[currentItem] = true;
        if (giveAndTakes.containsKey(currentItem)) {
          for (Integer getItem : giveAndTakes.get(currentItem)) {
            items.add(getItem);
            stack.add(getItem);
          }
        }
      }
    }
    System.out.println(items.size());
  }
}
