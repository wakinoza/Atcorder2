
import java.util.*;
import java.util.stream.*;
import java.io.*;

// A14
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer firstLine = new StringTokenizer(br.readLine());
    final int N = Integer.parseInt(firstLine.nextToken());
    final int K = Integer.parseInt(firstLine.nextToken());
    int[][] numbers = new int[4][N];
    for (int i = 0; i < 4; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      for (int j = 0; j < N; j++) {
        numbers[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    br.close();

    Set<Integer> sumABs = new HashSet<>();
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        sumABs.add(numbers[0][i] + numbers[1][j]);
      }
    }
    Set<Integer> sumCDs = new HashSet<>();
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        sumCDs.add(numbers[2][i] + numbers[3][j]);
      }
    }
    String answer = "No";
    for (Integer sumAB : sumABs) {
      int diff = K - sumAB;
      if (sumCDs.contains(diff)) {
        answer = "Yes";
        break;
      }
    }
    System.out.println(answer);
  }
}