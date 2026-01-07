import java.util.*;
import java.util.stream.*;

//ABC396A
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int sameCount = 1;
    int prevNumber = scanner.nextInt();
    boolean hasTripleNumber = false;
    for (int i = 1; i < n; i++){
      int currentNumber = scanner.nextInt();
      if (currentNumber == prevNumber) {
        sameCount++;
        if (sameCount >= 3) {
          hasTripleNumber = true;
        }
      } else {
        sameCount = 1;
        prevNumber = currentNumber;
      }
    }
    scanner.close();
    if (hasTripleNumber) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
