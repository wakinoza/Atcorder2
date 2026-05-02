
import java.util.*;
import java.util.stream.*;
import java.io.*;

// ABC456C
public class Main {
  public static void main(String[] args) throws IOException {
    final int DIVIDE = 998244353;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char[] s = br.readLine().trim().toCharArray();
    br.close();
    int sLength = s.length;
    long total = 0L;
    int left = 0;
    int right = 0;
    char prevLetter = s[0];
    while (left < sLength  && right < sLength) {
      if (right + 1 < sLength && s[right + 1] != prevLetter) {
        right++;
        prevLetter = s[right];
      } else {
        int diff = right - left + 1;
        long currentTotal = 0L;
        for (int i = 1; i <= diff; i++) {
          currentTotal += i;
        }
        total += currentTotal;
        if (right + 1 < sLength) {
          right++;
          left = right;
        } else {
          break;
        }
      }
    }
    long answer = total % DIVIDE;
    System.out.println(answer);
  }
}