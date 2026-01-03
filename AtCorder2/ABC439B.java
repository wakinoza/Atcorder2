import java.util.*;
import java.util.stream.*;

//ABC439B
public class Main {
  public static int getSumOfSquares(int n) {
    int answer = 0;
    int currentN = n;
    while(currentN > 0) {
      answer += (int)Math.pow((currentN % 10), 2);
      currentN = currentN / 10;
    }
    return answer;
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    String nString = String.valueOf(n);
    scanner.close();
    int currentSum = getSumOfSquares(n);
    int count = 10000;
    while (count > 0 && currentSum > 1) {
      currentSum = getSumOfSquares(currentSum);
      count--;
    }
    if (currentSum == 1) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
