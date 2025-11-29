import java.util.*;
import java.util.stream.*;

//ABC434A
//public class Main {
public class ABC434A {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int w = scanner.nextInt();
    int b = scanner.nextInt();
    scanner.close();
    int answer = (w * 1000) / b + 1;
    System.out.println(answer);
  }
}
