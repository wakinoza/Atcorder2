import java.util.*;
import java.util.stream.*;

//ABC441B
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    char[] sArray = scanner.next().toCharArray();
    Set<Character> sLetterSet = new HashSet<>();
    for (char sLetter : sArray) {
      sLetterSet.add(sLetter);
    }
    char[] tArray = scanner.next().toCharArray();
    Set<Character> tLetterSet = new HashSet<>();
    for (char tLetter : tArray) {
      tLetterSet.add(tLetter);
    }
    int q = scanner.nextInt();
    for (int i = 0; i < q; i++) {
      boolean isOnlySLetter = true;
      boolean isOnlyTLetter = true;
      char[] wArray = scanner.next().toCharArray();
      for (char wLetter :wArray) {
        if (!sLetterSet.contains(wLetter)) {
          isOnlySLetter = false;
        }
        if (!tLetterSet.contains(wLetter)) {
          isOnlyTLetter = false;
        }
      }

      if (isOnlySLetter && !isOnlyTLetter) {
        System.out.println("Takahashi");
      } else if (!isOnlySLetter && isOnlyTLetter) {
        System.out.println("Aoki");
      } else {
        System.out.println("Unknown");
      }
    }
    scanner.close();
  }
}
