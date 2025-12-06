import java.util.*;
import java.util.stream.*;

//ABC435B

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] inputs = new int[n];
    int[] sums = new int[n];
    int firstA = scanner.nextInt();
    inputs[0] = firstA;
    sums[0] =  firstA;
    for (int i = 1; i < n; i++) {
      int  a = scanner.nextInt();
      inputs[i] = a;
      sums[i] = sums[i - 1] + a;
    }
    scanner.close();
    
    int answer = 0;
    for (int i = 0; i < n - 1; i++) {
      for (int j = i + 1; j < n; j++) {
        int currentSum;
        if (i == 0) {
          currentSum = sums[j];
        } else {
          currentSum = sums[j] - sums[i - 1];
        }

        boolean hasDivisible = false;
        for (int k = i; k <= j; k++) {
          if (currentSum % inputs[k] == 0) {
            hasDivisible = true;
            break;
          }
        }
        
        if (!hasDivisible) {
          answer++;
        }
      }
    }
    System.out.println(answer);
  }
}
