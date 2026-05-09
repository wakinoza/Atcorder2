
import java.util.*;
import java.util.stream.*;
import java.io.*;

// ABC457C
class Line {
  public int[] line;

  public Line(int[] line) {
    this.line = line;
  }

  public int[] getLine() {
    return line;
  }

  public int getLastNumber() {
    return line[line.length - 1];
  }
}

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer firstLine = new StringTokenizer(br.readLine());
    final int N = Integer.parseInt(firstLine.nextToken());
    final long K = Long.parseLong(firstLine.nextToken());

    Line[] lines = new Line[N + 1];
    int[] lArray = new int[N + 1];
    for (int i = 1; i <= N; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int l = Integer.parseInt(st.nextToken());
      lArray[i] = l;
      int[] line = new int[l + 1];
      for (int j = 1; j <= l; j++) {
        line[j] = Integer.parseInt(st.nextToken());
      }
      lines[i] = new Line(line);
    }
    StringTokenizer cLine = new StringTokenizer(br.readLine());
    long[] cArray = new long[N + 1];
    for (int i = 1; i <= N; i++) {
      cArray[i] = Long.parseLong(cLine.nextToken());
    }
    br.close();

    long diffK = K;
    int answer = 0;
    for (int i = 1; i <= N; i++) {
      int currentL = lArray[i];
      long currentC = cArray[i];
      long currentActionTotal = currentC * currentL;
      if (diffK - currentActionTotal <= 0) {
        int index = (int)(diffK % currentL);
        if (index == 0) {
          answer = lines[i].getLastNumber();
        } else {
          answer = lines[i].getLine()[index];
        }
        break;
      } else {
        diffK -= currentActionTotal;
      }
    }
    System.out.println(answer);
  }
}