import java.util.*;

//B06
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] winSum = new int[n];
    int[] loseSum = new int[n];
    int a = scanner.nextInt();
    if (a == 0) {
      winSum[0] = 0;
      loseSum[0] = 1;
    } else {
      winSum[0] = 1;
      loseSum[0] = 0;
    }
    for (int i = 1; i < n; i++) {
      int currentA = scanner.nextInt();
      if (currentA == 0) {
        winSum[i] = winSum[i - 1];
        loseSum[i] = loseSum[i - 1] + 1;
      } else {
        winSum[i] = winSum[i - 1] + 1;
        loseSum[i] = loseSum[i - 1];
      }
    }
    int q = scanner.nextInt();
    for (int i = 0; i < q; i++) {
      int l = scanner.nextInt() - 1;
      int r = scanner.nextInt() - 1;
      int winTotal;
      int loseTotal;
      if (l == 0) {
        winTotal = winSum[r];
        loseTotal = loseSum[r];
      } else {
        winTotal = winSum[r] - winSum[l - 1];
        loseTotal = loseSum[r] - loseSum[l - 1];
      }
      if (winTotal > loseTotal) {
        System.out.println("win");
      } else if (winTotal < loseTotal) {
        System.out.println("lose");
      } else {
        System.out.println("draw");
      }
    }
    scanner.close();
  }
}