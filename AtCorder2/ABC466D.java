import java.util.*;
import java.util.stream.*;
import java.io.*;

// ABC466D
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer firstLine = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(firstLine.nextToken());
    int m = Integer.parseInt(firstLine.nextToken());
    int answer = 0;
    Map <Integer, Set<Integer>> rCounts = new HashMap<>();
    Map <Integer, Set<Integer>> cCounts = new HashMap<>();
    int prevR = -1;
    int prevC = -1;
    for (int i = 1; i <= m; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int r = Integer.parseInt(st.nextToken());
      int c = Integer.parseInt(st.nextToken());
      if (r == prevR && c == prevC) {
        continue;
      }
      if (rCounts.containsKey(r)) {
        for (int currentC : rCounts.get(r)) {
          cCounts.get(currentC).remove(r);
          answer--;
        }
        rCounts.get(r).clear();
      }
      if (cCounts.containsKey(c)) {
        for (int currentR : cCounts.get(c)) {
          rCounts.get(currentR).remove(c);
          answer--;
        }
        cCounts.get(c).clear();
      }
      if(!rCounts.containsKey(r)) {
        rCounts.put(r, new HashSet<Integer>());
      }
      rCounts.get(r).add(c);
      if (!cCounts.containsKey(c)) {
        cCounts.put(c, new HashSet<Integer>());
      }
      cCounts.get(c).add(r);
      answer++;
      prevR = r;
      prevC = c;
    }
    br.close();
    System.out.println(answer);
  }
}