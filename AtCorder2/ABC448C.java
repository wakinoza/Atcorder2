
import java.util.*;
import java.util.stream.*;
import java.io.*;

// ABC448C
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer nq = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(nq.nextToken());
    int q = Integer.parseInt(nq.nextToken());

    Map<Integer, List<Integer>> aAndIndexHash = new HashMap<>();
    StringTokenizer aLine = new StringTokenizer(br.readLine());
    for (int i = 1; i <= n; i++) {
        int a = Integer.parseInt(aLine.nextToken());
        if (!aAndIndexHash.containsKey(a)) {
          aAndIndexHash.put(a, new ArrayList<>());
        }
        aAndIndexHash.get(a).add(i);
    }
    List <Integer> sortedAList = new ArrayList<>(aAndIndexHash.keySet());
    Collections.sort(sortedAList);
    for (int i = 0; i < q; i++) {
      int k = Integer.parseInt(br.readLine().trim());
      Set<Integer> removeBallIndexes = new HashSet<>();
      StringTokenizer bLine = new StringTokenizer(br.readLine());
      for (int j = 0; j < k; j++) {
        removeBallIndexes.add(Integer.parseInt(bLine.nextToken()));
      }
      boolean checked = false;
      for (Integer a : sortedAList) {
        if(checked) {
          break;
        }
        for (Integer index : aAndIndexHash.get(a)) {
          if (!removeBallIndexes.contains(index)) {
            System.out.println(a);
            checked = true;
            break;
          }
        }
      }
    }
    br.close();
  }
}
