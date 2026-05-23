import java.util.*;
import java.util.stream.*;

//ABC459A
public class Main {
  public static void main(String[] args) {
    String WORD = "HelloWorld";
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    scanner.close();
    String answer = WORD.substring(0,x - 1) + WORD.substring(x);
    System.out.println(answer);
  }
}
