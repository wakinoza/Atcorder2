import java.util.*;
import java.util.stream.*;

//ABC409A
//public class ABC409A   {
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int s = scanner.nextInt();
    double sleepTime = s + 0.5;
    int prevWakeUpTime = 0;
    for (int i = 0; i < n; i++) {
      int t = scanner.nextInt();
      if (t - prevWakeUpTime > sleepTime) {
        System.out.println("No");
        return;
      } else {
        prevWakeUpTime = t;
      }
    }
    System.out.println("Yes");
    scanner.close();
  }
}

