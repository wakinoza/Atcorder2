
import java.util.*;
import java.util.stream.*;
import java.io.*;

// ABC453B
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer firstLine = new StringTokenizer(br.readLine());
    final int T = Integer.parseInt(firstLine.nextToken());
    final int X = Integer.parseInt(firstLine.nextToken());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int prevRec = Integer.parseInt(st.nextToken());
    System.out.println("0 " + prevRec);
    for (int i = 1; i <= T; i++) {
      int a = Integer.parseInt(st.nextToken());
      if (Math.abs(a - prevRec) >= X) {
        System.out.println(i + " " + a);
        prevRec = a;
      }
    }
    br.close();
  }
}
