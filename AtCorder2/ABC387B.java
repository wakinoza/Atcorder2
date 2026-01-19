import java.util.*;
import java.util.stream.*;

//ABC387B
public class Main {
  public static void main(String[] args) {
    int gridTotal = 0;
    int[] gridCount = new int[82];
    Arrays.fill(gridCount, 0);
    for (int i = 1; i <= 9; i++) {
      for (int j = 1; j <= 9; j++) {
        int currentGrid = i * j;
        gridTotal += currentGrid;
        gridCount[currentGrid]++;
      }
    }
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    scanner.close();

    if (gridCount[x] == 0) {
      System.out.println(gridTotal);
    } else {
      int answer = gridTotal - (x * gridCount[x]);
      System.out.println(answer);
    }
  }
}