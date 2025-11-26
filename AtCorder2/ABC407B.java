import java.util.*;
import java.util.stream.*;

//ABC407B
//public class ABC   {
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    int y = scanner.nextInt();
    scanner.close();
    int applicableTotal = 0;
    for (int i = 1; i <= 6; i++) {
      for (int j = 1 ; j <= 6; j++) {
        if (i + j >= x || Math.abs(i - j) >= y) {
          applicableTotal++;
        }
      }
    }
    if (applicableTotal == 0) {
      System.out.println(0);
    }else {
      System.out.println(applicableTotal / 36.0);
    }
  }
}
