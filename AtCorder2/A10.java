
import java.util.*;
import java.util.stream.*;
import java.io.*;

// A10
public class Main {
  public static void main(String[] args) throws IOException {
    // 1. 入力準備（標準入力をバッファリングして読み込む）
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine().trim());
    int[] aArray = new int[n + 1];
    int[] maxAFromLeft = new int[n + 1];
    StringTokenizer aLine = new StringTokenizer(br.readLine());
    for (int i = 1; i <= n; i++) {
      int a = Integer.parseInt(aLine.nextToken());
      aArray[i] = a;
      if (i == 1) {
        maxAFromLeft[i] = a;
      } else {
        maxAFromLeft[i] = Math.max(a, maxAFromLeft[i - 1]);
      }
    }
    int[] maxAFromRight = new int[n + 1];
    for (int i = n ; i >= 1; i--) {
      int a = aArray[i];
      if (i == n) {
        maxAFromRight[i] = a;
      } else {
        maxAFromRight[i] = Math.max(a, maxAFromRight[i + 1]);
      }
    }
    int d = Integer.parseInt(br.readLine().trim());
    for (int i = 0; i < d; i++) {
      StringTokenizer lr = new StringTokenizer(br.readLine());
      int l = Integer.parseInt(lr.nextToken());
      int r = Integer.parseInt(lr.nextToken());
      int answer = Math.max(maxAFromLeft[l - 1] ,maxAFromRight[r + 1]);
      System.out.println(answer);
    }
    br.close();
  }
}
