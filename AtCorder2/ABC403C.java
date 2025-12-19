import java.util.*;
import java.util.stream.*;

//ABC403C
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int q = scanner.nextInt();
    Set<String> availableUserPages = new HashSet<>();
    Set<Integer> allGrantUsers = new HashSet<>();
    for (int i = 0; i < q; i++) {
      int queryNumber = scanner.nextInt();
      int x = scanner.nextInt();
      if (queryNumber == 1) {
        int y = scanner.nextInt();
        availableUserPages.add(x + "-" + y);
      } else if (queryNumber == 2) {
        allGrantUsers.add(x);
      } else {
        int y = scanner.nextInt();
        String userPaseString = x + "-" + y;
        if (allGrantUsers.contains((x)) || availableUserPages.contains(userPaseString)) {
          System.out.println("Yes");
        } else {
          System.out.println("No");
        }
      }
    }
    scanner.close();
  }
}
