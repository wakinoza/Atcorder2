
import java.util.*;
import java.util.stream.*;
import java.io.*;

// ABC446C
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String firstLine = br.readLine();
    int t = Integer.parseInt(firstLine.trim());

    for (int i = 0; i < t; i++) {
      StringTokenizer ndLine = new StringTokenizer(br.readLine());
      int n = Integer.parseInt(ndLine.nextToken());
      int d = Integer.parseInt(ndLine.nextToken());
      int[] aArray = new int[n + 1];
      StringTokenizer aLine = new StringTokenizer(br.readLine());
      for (int j = 1; j <= n; j++) {
        aArray[j] = Integer.parseInt(aLine.nextToken());
      }
      Deque<Integer> eggQue = new ArrayDeque<>();
      StringTokenizer bLine = new StringTokenizer(br.readLine());
      for (int j = 1; j <= n; j++) {
        for (int k = 0; k < aArray[j]; k++) {
          eggQue.addLast(j);
        }
        int b = Integer.parseInt(bLine.nextToken());
        for (int k = 0; k < b; k++) {
          eggQue.pollFirst();
        }
        while (eggQue.size() >= 1 && eggQue.peekFirst() <= j - d) {
          eggQue.pollFirst();
        }
      }
      System.out.println(eggQue.size());
    }
    br.close();
  }
}