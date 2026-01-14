import java.util.*;
import java.util.stream.*;

//ABC391A
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char[] dArray = scanner.next().toCharArray();
    scanner.close();
    Map<Character, String> directions = new HashMap<>();
    directions.put('N', "S");
    directions.put('E', "W");
    directions.put('W', "E");
    directions.put('S', "N");
    StringBuilder answer = new StringBuilder();
    for (char d : dArray) {
      answer.append(directions.get(d));
    }
    System.out.println(answer.toString());
  }
}
