import java.util.*;
import java.util.stream.*;

//ABC
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] numbers = new int[n];
    Map<Integer, Integer> numberCountMap = new HashMap<>();
    Set<Integer> numberSet = new HashSet<>();
    for (int i = 0; i < n;i++) {
      int a = scanner.nextInt();
      numbers[i] = a;
      numberCountMap.put(a, numberCountMap.getOrDefault(a, 0) + 1);
      numberSet.add(a);
    }
    scanner.close();
    int maxKinds = numberSet.size();
    int sumMax = 0;
    int currentSum;
    int currentLeftSum = 0;
    int currentRightSum = maxKinds;
    Set<Integer> leftSet = new HashSet<>();
    for (int i = 0; i < n; i++) {
      int currentA = numbers[i];
      leftSet.add(currentA);
      currentLeftSum = leftSet.size();
      numberCountMap.put(currentA, numberCountMap.get(currentA) - 1);
      if (numberCountMap.get(currentA) <= 0) {
        currentRightSum--;
      }
      currentSum = currentLeftSum + currentRightSum;
      if (currentSum > sumMax) {
        sumMax = currentSum;
      }
    }
    System.out.println(sumMax);
  }
}
