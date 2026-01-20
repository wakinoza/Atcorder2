import java.util.*;
import java.util.stream.*;

//ABC386A
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Set<Integer> cards = new HashSet<>();
    for (int i = 0; i < 4; i++) {
      cards.add(scanner.nextInt());
    }
    scanner.close();
    String answer = (cards.size() == 2) ? "Yes" : "No";
    System.out.println(answer);
  }
}
