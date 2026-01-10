import java.util.*;
import java.util.stream.*;

//ABC440B
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    Map<Integer, Integer> secondIndexHash = new TreeMap<>();
    for (int i = 1; i <= n; i++){
      int t = scanner.nextInt();
      secondIndexHash.put(t, i);
    }
    scanner.close();
    int index = 0;
    StringBuilder answer = new StringBuilder();
    for (Integer value : secondIndexHash.values()) {
      if (index >= 3) {
        break;
      }
      if (index >= 1) {
        answer.append(" ");
      }
      answer.append(value);
      index++;
    }
    System.out.println(answer.toString());
  }
}
