import java.util.*;
import java.util.stream.*;

//ABC396B
public class Main {
  public static void main(String[] args) {
    Deque<Integer> stack = new ArrayDeque<>();
    for (int i = 0; i < 100; i++) {
      stack.add(0);
    }
    Scanner scanner = new Scanner(System.in);
    int q = scanner.nextInt();
    for (int i = 0; i < q; i++) {
      int query = scanner.nextInt();
      if (query == 1) {
        stack.add(scanner.nextInt());
      } else {
        System.out.println(stack.pollLast());
      }
    }
    scanner.close();
  }
}
