
import java.util.*;
import java.util.stream.*;
import java.io.*;

// ABC443C
public class Main {
  public static void main(String[] args) throws IOException {
    final int UN_LOOK_TIME = 100;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer firstLine = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(firstLine.nextToken());
    long t = Long.parseLong(firstLine.nextToken());
    StringTokenizer st = new StringTokenizer(br.readLine());

    long[] aArray = new long[n];
    for (int i = 0; i < n; i++) {
      aArray[i] = Long.parseLong(st.nextToken());
    }
    br.close();
    if (n == 0) {
      System.out.println(t);
      return;
    }
    long answer = t - UN_LOOK_TIME;
    long nextLookTime = aArray[0] + UN_LOOK_TIME;
    for (int i = 1; i < n; i++) {
      long currentA = aArray[i];
      if (currentA >= nextLookTime) {
        answer -= Math.min(UN_LOOK_TIME, t - currentA);
        nextLookTime = currentA + UN_LOOK_TIME;
      }
    }
    System.out.println(answer);
  }
}