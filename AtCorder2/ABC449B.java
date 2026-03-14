
import java.util.*;
import java.util.stream.*;
import java.io.*;

// ABC449B
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer firstLine = new StringTokenizer(br.readLine());
    int h = Integer.parseInt(firstLine.nextToken());
    int w = Integer.parseInt(firstLine.nextToken());
    int q = Integer.parseInt(firstLine.nextToken());
    int currentH = h;
    int currentW = w;
    for (int i = 0; i < q; i++) {
      StringTokenizer queryLine = new StringTokenizer(br.readLine());
      int query = Integer.parseInt(queryLine.nextToken());
      if (query == 1) {
        int r = Integer.parseInt(queryLine.nextToken());
        System.out.println(r * currentW);
        currentH -= r;
      } else {
        int c = Integer.parseInt(queryLine.nextToken());
        System.out.println(c * currentH);
        currentW -= c;
      }
    }
    br.close();
  }
}