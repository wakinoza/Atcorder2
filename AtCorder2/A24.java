
import java.util.*;
import java.util.stream.*;
import java.io.*;

// A24
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final int N = Integer.parseInt(br.readLine().trim());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] A = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = Integer.parseInt(st.nextToken());
    }
    br.close();
    int[] L = new int[N];
    Arrays.fill(L, Integer.MAX_VALUE);
    int len = 0;
    for (int i = 0; i < N; i++){
      int pos = Arrays.binarySearch(L, 0, len, A[i]);
      if (pos < 0) {
        pos =  ~pos;
      }
      L[pos] = A[i];
      if (pos == len) {
        len++;
      }
    }

    System.out.println(len);
  }
}