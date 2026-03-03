import java.util.*;

//A04
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    scanner.close();
    StringBuilder answer = new StringBuilder();
    int digit;
    int currentN = n;
    for (int i = 9; i >= 0; i--) {
      digit = (int) Math.pow(2, i);
      answer.append(currentN / digit);
      currentN %= digit;
    }
    System.out.println(answer.toString());
  }
}
