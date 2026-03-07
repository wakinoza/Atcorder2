
import java.util.*;
import java.util.stream.*;
import java.io.*;

// ABC448B
public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer nm = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(nm.nextToken());
    int m = Integer.parseInt(nm.nextToken());

    int[] maxOfPeppers = new int[m + 1];
    StringTokenizer cLine = new StringTokenizer(br.readLine());
    for (int i = 1; i <= m; i++) {
      maxOfPeppers[i] = Integer.parseInt(cLine.nextToken());
    }

    int[] needPeppers = new int[m + 1];
    Arrays.fill(needPeppers,0);
    for (int i = 0; i < n; i++) {
      StringTokenizer ab = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(ab.nextToken());
      int b = Integer.parseInt(ab.nextToken());
      needPeppers[a] += b;
    }
    br.close();
    int answer = 0;
    for (int i = 1; i <=m; i++) {
      answer += Math.min(maxOfPeppers[i], needPeppers[i]);
    }
    System.out.println(answer);
  }
}