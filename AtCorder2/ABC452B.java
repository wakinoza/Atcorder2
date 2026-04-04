import java.util.*;
import java.util.stream.*;

//ABC452B
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final int H = scanner.nextInt();
    final int W = scanner.nextInt();
    scanner.close();
    String startAndEndLine = "#".repeat(W);
    String otherLine = "#" +  ".".repeat(W - 2) + "#";
    for (int i = 0; i < H ;i++) {
      if (i == 0 || i == H - 1) {
        System.out.println(startAndEndLine);
      } else {
        System.out.println(otherLine);
      }
    }
  }
}
