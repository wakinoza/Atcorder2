
import java.util.*;
import java.util.stream.*;
import java.io.*;

// A17
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final int N = Integer.parseInt(br.readLine().trim());
    StringTokenizer st1 = new StringTokenizer(br.readLine());
    int[] aArray = new int[N + 1];
    for (int i = 2; i <= N; i++) {
      aArray[i] = Integer.parseInt(st1.nextToken());
    }
    StringTokenizer st2 = new StringTokenizer(br.readLine());
    int[] bArray = new int[N + 1];
    for (int i = 3; i <= N; i++) {
      bArray[i] = Integer.parseInt(st2.nextToken());
    }
    br.close();
    int[] dp = new int[N + 1];
    dp[1] = 0;
    dp[2] = aArray[2];
    for (int i = 3; i <= N; i++) {
      dp[i] = Math.min((dp[i - 1] + aArray[i]), (dp[i - 2] + bArray[i]));
    }
    List<Integer> answer = new ArrayList<>();
    int currentIndex = N;
    answer.add(currentIndex);
    while(currentIndex > 2) {
      if (dp[currentIndex] == dp[currentIndex - 1] + aArray[currentIndex]) {
        currentIndex--;
      } else {
        currentIndex -= 2;
      }
      answer.add(currentIndex);
    }
    if (currentIndex == 2) {
      answer.add(1);
    }
    int answerSize = answer.size();
    System.out.println(answer.size());
    for (int i = answerSize - 1; i >= 0; i--) {
        if (i == answerSize - 1) {
          System.out.print(answer.get(i));
        } else {
          System.out.print(" ");
          System.out.print(answer.get(i));
        }
    }
  }
}
