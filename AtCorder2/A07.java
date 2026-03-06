import java.util.*;

//A07
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int d = scanner.nextInt();
    int[] upDowns = new int[d + 1];
    Arrays.fill(upDowns, 0);
    int n = scanner.nextInt();
    for (int i = 0; i < n; i++) {
      int l = scanner.nextInt() - 1;
      int r = scanner.nextInt() - 1;
      upDowns[l]++;
      upDowns[r + 1]--;
    }
    scanner.close();
    int yesterdayAttendance = upDowns[0];
    System.out.println(yesterdayAttendance);
    for (int i = 1; i < d; i++) {
      int todayAttendance = yesterdayAttendance + upDowns[i];
      System.out.println(todayAttendance);
      yesterdayAttendance = todayAttendance;
    }
  }
}
