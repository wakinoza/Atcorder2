
import java.util.*;
import java.util.stream.*;
import java.io.*;

// A28
public class Main {
  public static void main(String[] args) throws IOException {
    final int DIVIDER = 10000;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final int N = Integer.parseInt(br.readLine().trim());
    long answer = 0L;
    for (int i = 0; i < N; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      String t = st.nextToken();
      int a = Integer.parseInt(st.nextToken());
      if (t.equals("+")) {
        answer += a;
      } else if (t.equals("-")){
        answer -= a;
      } else {
        answer *= a;
      }
      answer %= DIVIDER;
      if (answer < 0) {
        answer += DIVIDER;
      }
      System.out.println(answer);
    }
    br.close();
  }
}