import java.util.*;

//A03
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int k = scanner.nextInt();
    List<Integer> pList = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      pList.add(scanner.nextInt());
    }
    Set<Integer> qSet = new HashSet<>();
    for (int i = 0; i < n; i++) {
      qSet.add(scanner.nextInt());
    }
    scanner.close();
    String answer = "No";
    int diff;
    for (Integer p : pList) {
      diff = k - p;
      if (qSet.contains(diff)) {
        answer = "Yes";
        break;
      }
    }
    System.out.println(answer);

  }
}
