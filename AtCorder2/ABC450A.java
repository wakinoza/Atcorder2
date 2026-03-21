import java.util.*;
import java.util.stream.*;

//ABC450A
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    scanner.close();
    System.out.print(n);
    for (int i = n - 1; i >= 1; i--) {
      System.out.print("," + i);
    }
    System.out.println("");
  }
}