
import java.util.*;
import java.util.stream.*;
import java.io.*;

// ABC454B
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer firstLine = new StringTokenizer(br.readLine());
    final int N = Integer.parseInt(firstLine.nextToken());
    final int M = Integer.parseInt(firstLine.nextToken());
    Set<Integer> clothes = new HashSet<>();
    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      clothes.add(Integer.parseInt(st.nextToken()));
    }
    br.close();
    int clotheSize = clothes.size();
    String answer1 = "No";
    if (clotheSize == N) {
      answer1 = "Yes";
    }
    System.out.println(answer1);
    String answer2 = "No";
    if (clotheSize == M) {
      answer2 = "Yes";
    }
    System.out.println(answer2);
  }
}