import java.util.*;
import java.util.stream.*;

//ABC440A
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    int y = scanner.nextInt();
    scanner.close();
    int answer = x * (int)Math.pow(2, y);
    System.out.println(answer);
  }
}
