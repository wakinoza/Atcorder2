import java.util.*;
import java.util.stream.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    Deque<Integer> valStack = new ArrayDeque<>();
    Deque<Integer> countStack = new ArrayDeque<>();

    int currentSize = 0;

    for (int i = 0; i < n; i++) {
      int a = scanner.nextInt();
      currentSize++;

      if (!valStack.isEmpty() && valStack.peek() == a) {
        int count = countStack.pop() + 1;
        if (count == 4) {
          valStack.pop();
          currentSize -= 4;
        } else {
          countStack.push(count);
        }
      } else {
        valStack.push(a);
        countStack.push(1);
      }
    }

    System.out.println(currentSize);
  }
}
