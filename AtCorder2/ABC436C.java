import java.util.*;
import java.util.stream.*;

//ABC436C
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    Set<String> blockIndex = new HashSet<>();
    int answer = 0;
    for (int i = 0; i < m; i++) {
      int r = scanner.nextInt();
      int c = scanner.nextInt();
      String rc = r + "/" + c;
      String r1c = (r + 1) + "/" + c;
      String rc1 = r + "/" + (c + 1);
      String r1c1 = (r + 1) + "/" + (c + 1);
      if (!blockIndex.contains(rc) && !blockIndex.contains(r1c) && !blockIndex.contains(rc1) && !blockIndex.contains(r1c1) ) {
        answer++;
        blockIndex.add(rc);
        blockIndex.add(r1c);
        blockIndex.add(rc1);
        blockIndex.add(r1c1);
      }
    }
    scanner.close();
    System.out.println(answer);
  }
}
