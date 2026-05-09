import java.util.*;
import java.util.stream.*;

//ABC457A
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final int N = scanner.nextInt();
    int[] aArray = new int[N + 1];
    for (int i = 1; i <= N; i++) {
      aArray[i] = scanner.nextInt();
    }
    final int X = scanner.nextInt();
    scanner.close();
    System.out.println(aArray[X]);
  }
}
