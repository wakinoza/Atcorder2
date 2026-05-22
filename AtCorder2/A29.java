import java.util.*;
import java.util.stream.*;

//A29余りの計算
public class Main {
  public static void main(String[] args) {
    final int DIVIDE = 1_000_000_007;
    final int MAX_INDEX = 30;
    Scanner scanner = new Scanner(System.in);
    long a = scanner.nextLong();
    long b = scanner.nextLong();
    scanner.close();
    long p = a;
    long answer = 1L;
    long currentB = b;
    while (currentB > 0) {
      if (currentB % 2 == 1) {
        answer = (answer * p) % DIVIDE;
      }
      p = (p * p) % DIVIDE;
      currentB /= 2;
    }
    System.out.println(answer);
  }
}

// public class Main {
//   public static void main(String[] args) {
//     final int DIVIDE = 1_000_000_007;
//     Scanner scanner = new Scanner(System.in);
//     int a = scanner.nextInt();
//     int b = scanner.nextInt();
//     scanner.close();
//     long answer = a;
//     for (int i = 2; i <= b; i++) {
//       answer *= a;
//       if (answer > DIVIDE) {
//         answer %= DIVIDE;
//       }
//     }
//     System.out.println(answer);
//   }
// }