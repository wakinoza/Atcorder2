import java.util.*;
import java.util.stream.*;

//ABC
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int h = scanner.nextInt();
    int w = scanner.nextInt();
    int n = scanner.nextInt();
    List<Set<Integer>> grids = new ArrayList<>();
    for (int i = 0; i < h; i++) {
      grids.add(new HashSet<Integer>());
      for (int j = 0; j < w; j++) {
        grids.get(i).add(scanner.nextInt());
      }
    }
    int[] countTotals = new int[h];
    for (int i = 0; i < n; i++) {
      int callNumber = scanner.nextInt();
      for (int j = 0; j < h; j++) {
        if (grids.get(j).contains(callNumber)) {
          countTotals[j]++;
          break;
        }
      }
    }
    scanner.close();
    int answer = 0;
    for (int countTotal : countTotals) {
      if (answer < countTotal) {
        answer = countTotal;
      }
    }
    System.out.println(answer);
  }
}
