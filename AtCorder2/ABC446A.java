import java.util.*;
import java.util.stream.*;

//ABC446A
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String s = scanner.next();
    scanner.close();
    String answer = "Of" + s.toLowerCase();
    System.out.println(answer);
  }
}
