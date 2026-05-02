
import java.util.*;
import java.util.stream.*;
import java.io.*;

// ABC456B
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] count4 = new int[3];
    int[] count5 = new int[3];
    int[] count6 = new int[3];

    for (int i = 0; i <= 2; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      for (int j = 0; j < 6; j++ ){
        int a = Integer.parseInt(st.nextToken());
        if (a == 4) {
          count4[i]++;
        } else if (a == 5) {
          count5[i]++;
        } else if (a == 6) {
          count6[i]++;
        }
      }
    }
    br.close();
    int combinationTotal = (count4[0] * count5[1] * count6[2] + count4[0] * count5[2] * count6[1] + count4[1] * count5[0] * count6[2] +count4[1] * count5[2] * count6[0] +count4[2] * count5[1] * count6[0] + count4[2] * count5[0] * count6[1] );
    System.out.println(combinationTotal / Math.pow(6.0, 3));
  }
}