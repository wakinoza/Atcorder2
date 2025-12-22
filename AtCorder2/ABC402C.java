import java.util.*;
import java.util.stream.*;

//ABC402C


public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m= scanner.nextInt();
    int[] dishes = new int[m + 1];
    Set<Integer>[] ingredients = (Set<Integer>[]) new Set[n + 1];
    for (int i = 1; i <= n; i++) {
      ingredients[i] = new HashSet<>();
    }
    for (int i = 1; i <= m; i++) {
      int  k = scanner.nextInt();
      for (int j = 0; j < k; j++) {
        dishes[i]++;
        ingredients[scanner.nextInt()].add(i);
      }
    }
    int edibleDishSum = 0;
    for (int i = 0; i < n; i++) {
      int b = scanner.nextInt();
      for (Integer dish : ingredients[b]) {
        dishes[dish]--;
        if (dishes[dish] == 0) {
          edibleDishSum++;
        }
      }
      System.out.println(edibleDishSum);
    }
    scanner.close();
  }
}
