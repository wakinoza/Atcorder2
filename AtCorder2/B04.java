import java.util.*;

//B04
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    scanner.close();
    int currentN = n;
    int answer = 0;
    for (int i = 0; i <= 8; i++) {
      int currentMinDigit = currentN % 10;
      answer += (int) Math.pow(2, i) * currentMinDigit;
      currentN /= 10;
      if (currentN == 0) {
        break;
      }
    }
    System.out.println(answer);

  }
}
