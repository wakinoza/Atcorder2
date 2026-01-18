import java.util.*;
import java.util.stream.*;

//ABC388A
public class Main {
  public static void main(String[] args) {
    final String WORD = "UPC";
    Scanner scanner = new Scanner(System.in);
    String[] sArray = scanner.next().split("");
    scanner.close();
    System.out.println(sArray[0] + WORD);
  }
}