import java.util.*;
import java.util.stream.*;

//ABC445A
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char[] sArray = scanner.next().toCharArray();
    scanner.close();
    String answer = (sArray[0] == sArray[sArray.length - 1]) ? "Yes":"No";
    System.out.println(answer);
  }
}