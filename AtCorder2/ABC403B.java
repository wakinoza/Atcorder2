import java.util.*;
import java.util.stream.*;

//ABC403B
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char[] tArray = scanner.next().toCharArray();
    char[] uArray = scanner.next().toCharArray();
    scanner.close();

    int tLength = tArray.length;
    int uLength = uArray.length;
    for (int i = 0; i <= tLength - uLength; i++) {
      if (tArray[i] == uArray[0] || tArray[i] == '?') {
        boolean hasSubstring = true;
        for (int j = 1; j < uLength; j++) {
          if (tArray[i + j] != uArray[j] && tArray[i + j] != '?') {
            hasSubstring = false;
            break;
          }
        }
        if (hasSubstring) {
          System.out.println("Yes");
          return;
        }
      }
    }
    System.out.println("No");
  }
}
