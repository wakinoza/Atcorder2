import java.util.*;
import java.util.stream.*;

//ABC389B
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long x = scanner.nextLong();
    scanner.close();
    long factorialTotal = 1L;
    int currentN = 1;
    while (factorialTotal < x) {
      currentN++;
      factorialTotal *= currentN;
    }
    System.out.println(currentN);
  }
}
