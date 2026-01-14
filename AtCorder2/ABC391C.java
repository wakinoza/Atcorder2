import java.util.*;
import java.util.stream.*;

//ABC391C
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int q = scanner.nextInt();
    int[] nestIndexes = new int[n + 1];
    for (int i = 1; i <= n; i++) {
      nestIndexes[i] = i;
    }
    int[] pigeonCounts = new int[n + 1];
    for (int i = 1; i <= n; i++) {
      pigeonCounts[i] = 1;
    }
    int moreTwoCount = 0;
    
    for (int i = 0; i < q; i++) {
      int query = scanner.nextInt();
      if (query == 1) {
        int p = scanner.nextInt();
        int h = scanner.nextInt();
        int prevNestIndex = nestIndexes[p];
        nestIndexes[p] = h;
        pigeonCounts[prevNestIndex]--;
        if (pigeonCounts[prevNestIndex] == 1) {
          moreTwoCount--;
        }
        pigeonCounts[h]++;
        if (pigeonCounts[h] == 2) {
          moreTwoCount++;;
        }
      } else {
        System.out.println(moreTwoCount);
      }
    }
    scanner.close();
  }
}
