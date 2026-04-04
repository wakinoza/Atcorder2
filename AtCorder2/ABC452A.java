import java.util.*;
import java.util.stream.*;

//ABC452A
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final int M = scanner.nextInt();
    final int D = scanner.nextInt();
    scanner.close();
    String answer = "No";
    if ((M == 1 && D == 7) || (M == 3 && D == 3) || (M == 5 && D == 5)|| (M == 7 && D == 7)|| (M == 9 && D == 9)) {
      answer = "Yes";
    }
    System.out.println(answer);
  }
}
