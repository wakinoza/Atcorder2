
import java.util.*;
import java.util.stream.*;
import java.io.*;

// ABC457B
class Line {
  public int[] line;

  public Line(int[] line) {
    this.line = line;
  }
  public int[] getLine () {
    return line;
  }
}
public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final int N = Integer.parseInt(br.readLine().trim());
    Line[] lArray = new Line[N + 1];
    for (int i = 1; i <= N; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int l = Integer.parseInt(st.nextToken());
      int[] line = new int[l + 1];
      for (int j = 1; j <= l; j++) {
        line[j] = Integer.parseInt(st.nextToken());
      }
      lArray[i] = new Line(line);
    }
    StringTokenizer xy = new StringTokenizer(br.readLine());
    final int X = Integer.parseInt(xy.nextToken());
    final int Y = Integer.parseInt(xy.nextToken());
    br.close();
    System.out.println(lArray[X].getLine()[Y]);
  }
}