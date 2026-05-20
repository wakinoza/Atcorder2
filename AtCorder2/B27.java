import java.util.*;
import java.util.stream.*;

//B27
public class Main {
  public static long gcdWhileLoopIteration(long n1, long n2) {
    while (n1 % n2 != 0) {
      long prevN1 = n1;
      n1 = n2;
      n2 = prevN1 % n2;
    }
    return n2;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final long A = scanner.nextLong();
    final long B = scanner.nextLong();
    scanner.close();
    long gcd = gcdWhileLoopIteration(A, B);
    long answer = A * B / gcd;
    System.out.println(answer);
  }
}
