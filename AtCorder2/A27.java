import java.util.*;
import java.util.stream.*;

//A27
public class Main {
  public static int gcdWhileLoopIteration(int n1, int n2) {
    while (n1 % n2 != 0) {
      int prevN1 = n1;
      n1 = n2;
      n2 = prevN1 % n2;
    }
    return n2;
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final int A = scanner.nextInt();
    final int B = scanner.nextInt();
    scanner.close();
    int answer = gcdWhileLoopIteration(A, B);
    System.out.println(answer);
  }
}
