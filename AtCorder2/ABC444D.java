
import java.util.*;
import java.util.stream.*;
import java.io.*;

// ABC444D
public class Main {
  public static void main(String[] args) throws IOException {
    final int MAX_DIGIT = 200000 + 100;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String firstLine = br.readLine();
    int n = Integer.parseInt(firstLine.trim());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] digits = new int[MAX_DIGIT];
    Arrays.fill(digits, 0);
    int maxA = 0;
    for (int i = 0; i < n; i++) {
      int a = Integer.parseInt(st.nextToken());
      digits[a]++;
      if (maxA < a) {
        maxA = a;
      }
    }
    br.close();

    for (int i = maxA; i > 1; i--) {
      digits[i - 1] += digits[i];
    }
    for (int i = 1; i < MAX_DIGIT - 1; i++) {
      if (digits[i] >= 10) {
        digits[i + 1] += digits[i] / 10;
        digits[i] = digits[i] % 10;
      }
    }
    boolean isNeedNumber = false;
    StringBuilder answer = new StringBuilder();
    for (int i = MAX_DIGIT - 1; i > 0; i--) {
      if (!isNeedNumber && digits[i] == 0) {
        continue;
      }
      if (!isNeedNumber && digits[i] != 0) {
        isNeedNumber = true;
      }
      if (isNeedNumber) {
        answer.append(digits[i]);
      }
    }
    System.out.println(answer.toString());
  }
}