import java.util.*;
import java.util.stream.*;

//ABC402B
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int q = scanner.nextInt();
    Deque<Integer> menuQueue = new ArrayDeque<>();
    for (int i = 0; i < q; i++) {
      int queryNumber = scanner.nextInt();
      if (queryNumber == 1) {
        menuQueue.add(scanner.nextInt());
      } else {
        int nextMenu = menuQueue.poll();
        System.out.println(nextMenu);
      }
    }
    scanner.close();
  }
}
