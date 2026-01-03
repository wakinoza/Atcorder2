import java.util.*;
import java.util.stream.*;

//ABC439A
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    scanner.close();
    int answer = (int)Math.pow(2,n) - 2 * n;
    System.out.println(answer);
  }
}
