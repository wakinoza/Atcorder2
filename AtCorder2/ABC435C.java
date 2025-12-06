import java.util.*;
import java.util.stream.*;

//ABC435C
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] dominos = new int[n + 1];
    for (int i = 1; i <= n; i++) {
      dominos[i] = i + scanner.nextInt() - 1;
    }
    scanner.close();

    int fallenDominoIndex = dominos[1];
    int currentIndex = 2;
    while (currentIndex <= n && currentIndex <= fallenDominoIndex) {
      int next = dominos[currentIndex];
      if (fallenDominoIndex < next) {
        fallenDominoIndex = next;
      }
      currentIndex++;
    }
    
    System.out.println(Math.min(fallenDominoIndex, n));
  }
}
