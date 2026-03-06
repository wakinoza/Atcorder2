import java.util.*;

//B07
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    int[] upDowns = new int[t + 1];
    Arrays.fill(upDowns, 0);
    int n = scanner.nextInt();
    for (int i = 0; i < n; i++) {
      int l = scanner.nextInt();
      int r = scanner.nextInt();
      upDowns[l]++;
      upDowns[r]--;
    }
    scanner.close();
    int prevHourTotal = upDowns[0];
    System.out.println(prevHourTotal);
    for (int i = 1; i < t; i++) {
      int currentStaffTotal = prevHourTotal + upDowns[i];
      System.out.println(currentStaffTotal);
      prevHourTotal = currentStaffTotal;
    }
  }
}
