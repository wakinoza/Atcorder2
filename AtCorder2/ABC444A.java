import java.util.*;
import java.util.stream.*;

//ABC444A
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char[] nArray = scanner.next().toCharArray();
    scanner.close();
    if (nArray[0] == nArray[1] && nArray[0] == nArray[2] && nArray[2] == nArray[1]) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
