import java.util.*;
import java.util.stream.*;

//ABC449A
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int d = scanner.nextInt();
    scanner.close();
    double answer = (d / 2.0) * (d / 2.0) * Math.PI;
    System.out.println(answer);
  }
}