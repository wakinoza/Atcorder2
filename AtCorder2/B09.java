
import java.util.*;
import java.util.stream.*;
import java.io.*;

// // B09
// public class Main {
//   public static void main(String[] args) throws IOException {
//     final int MAX = 1500;
//     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//     int n = Integer.parseInt(br.readLine().trim());
//     boolean[][] hasPapers = new boolean[MAX][MAX];
//     int answer = 0;
//     for (int i = 0; i < n; i++) {
//       StringTokenizer st = new StringTokenizer(br.readLine());
//       int a = Integer.parseInt(st.nextToken());
//       int b = Integer.parseInt(st.nextToken());
//       int c = Integer.parseInt(st.nextToken());
//       int d = Integer.parseInt(st.nextToken());
//       for (int j = a; j < c; j++) {
//         for (int k = b; k < d; k++) {
//           if (!hasPapers[j][k]) {
//             answer++;
//             hasPapers[j][k] = true;
//           }
//         }
//       }
//     }
//     br.close();
//     System.out.println(answer);
//   }
// }


// B09
public class Main {
  public static void main(String[] args) throws IOException {
    final int MAX = 1501;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine().trim());
    int[][] paperTotals = new int[MAX][MAX];
    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      int c = Integer.parseInt(st.nextToken());
      int d = Integer.parseInt(st.nextToken());
      paperTotals[a][b] += 1;
      paperTotals[c][b] -= 1;
      paperTotals[a][d] -= 1;
      paperTotals[c][d] += 1;
    }
    br.close();
    for (int i = 0; i < MAX; i++) {
      for (int j = 1; j < MAX; j++) {
        paperTotals[i][j] += paperTotals[i][j - 1];
      }
    }
    int answer = 0;
    for (int i = 0; i < MAX; i++) {
      for (int j = 0; j < MAX; j++) {
        if (j > 0) {
          paperTotals[j][i] += paperTotals[j - 1][i];
        }
        if (paperTotals[j][i] > 0) {
          answer++;
        }
      }
    }
    System.out.println(answer);
  }
}
