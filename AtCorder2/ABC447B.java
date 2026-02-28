import java.util.*;
import java.util.stream.*;

//ABC
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String s = scanner.next();
    char[] sArray = s.toCharArray();
    scanner.close();

    HashMap<Character, Integer> hashmap = new HashMap<>();
    for (char sChar : sArray) {
      hashmap.put(sChar, hashmap.getOrDefault(sChar, 0) + 1);
    }
    int maxCount = 0;
    for (Integer val : hashmap.values()) {
      if (val > maxCount) {
        maxCount = val;
      }
    }
    Set<Character> removeLetter = new HashSet<>();
    for (Map.Entry<Character, Integer> entry : hashmap.entrySet()) {
      if (entry.getValue() == maxCount) {
        removeLetter.add(entry.getKey());
      }
    }
    StringBuilder answer = new StringBuilder();
    for (char sChar : sArray) {
      if (!removeLetter.contains(sChar)) {
        answer.append(sChar);
      }
    }

      System.out.println(answer.toString());
  }
}
