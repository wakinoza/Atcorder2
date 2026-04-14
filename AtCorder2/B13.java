
import java.util.*;
import java.util.stream.*;
import java.io.*;

// B13
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer firstLine = new StringTokenizer(br.readLine());
    final int N = Integer.parseInt(firstLine.nextToken());
    final int K = Integer.parseInt(firstLine.nextToken());
    int[] aArray = new int[N];
    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      aArray[i] = Integer.parseInt(st.nextToken());
    }
    br.close();
    int answer = 0;
    for (int l = 0; l < N; l++) {
      int r = l;
      int sum = 0;
      while (r < N) {
        sum += aArray[r];
        if (sum > K) {
          break;
        } else {
          r++;
        }
      }
      answer += (r - l);
    }
    System.out.println(answer);
  }
}