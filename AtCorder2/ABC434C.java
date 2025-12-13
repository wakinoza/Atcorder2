import java.util.*;

//ABC434C
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    for (int i = 0; i < t; i++) {
      int n = scanner.nextInt();
      long h = scanner.nextLong();
      long prevL = h;
      long prevU = h;
      long prevTime = 0L;
      boolean canFly = true;

      for (int j = 0; j < n; j++) {
        long tn = scanner.nextLong();
        long l = scanner.nextLong();
        long u = scanner.nextLong();
        if (!canFly) {
          break;
        }
        long flyTime = tn - prevTime;
        long flyAreaHighest = prevU + flyTime;
        long flyAreaLowest = prevL - flyTime;
        if (flyAreaLowest <= 0) {
          flyAreaLowest = 1L;
        }
        if (flyAreaHighest < l || flyAreaLowest > u) {
          canFly = false;
          break;
        }
        
        if (flyAreaHighest >= u) {
          prevU = u;
        } else {
          prevU = flyAreaHighest;
        }
        if (flyAreaLowest >= l) {
          prevL = flyAreaLowest;
        } else {
          prevL = l;
        }
        prevTime = tn;
      }
      if (canFly) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
    scanner.close();
  }
}
