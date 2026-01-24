import java.util.*;
import java.util.stream.*;

//ABC442C
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int[] numOfCanReviews = new int[n + 1];
    Arrays.fill(numOfCanReviews,n - 1);
    for (int i = 0 ;i < m; i++) {
      numOfCanReviews[scanner.nextInt()]--;
      numOfCanReviews[scanner.nextInt()]--;
    }
    scanner.close();
    StringBuilder answerSB = new StringBuilder();

    for (int i = 1; i <= n; i++) {
      int canReview = numOfCanReviews[i];
      if (i > 1) {
        answerSB.append(" ");
      }
      if (canReview <= 2) {
        answerSB.append(0);
      } else if (canReview == 3) {
        answerSB.append(1);
      } else {
        long molecule = 1L;
        for (int j = canReview; j > canReview - 3; j--) {
          molecule *= j;
        }
        answerSB.append(molecule / 6);
      }
    }
    System.out.println(answerSB.toString());
  }
}
