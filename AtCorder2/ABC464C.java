
import java.util.*;
import java.util.stream.*;
import java.io.*;

// ABC464C
class Bird implements Comparable<Bird>{
  private int a;
  private int d;
  private int b;

  public Bird(int a, int d, int b) {
    this.a = a;
    this.d = d;
    this.b = b;
  }

  public int getA() {
    return this.a;
  }

  public int getD() {
    return this.d;
  }

  public int getB() {
    return this.b;
  }

  public int compareTo(Bird bird) {
    if (this.d < bird.d) {
      return -1;
    } else if (this.d > bird.d) {
      return 1;
    } else {
        return 0;
    }
  }
}
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer nm = new StringTokenizer(br.readLine());
    final int N = Integer.parseInt(nm.nextToken());
    final int M = Integer.parseInt(nm.nextToken());
    Bird[] birds = new Bird[N];
    int[] birdCount = new int[N + 1];
    Arrays.fill(birdCount, 0);
    Set<Integer> colorCountSet = new HashSet<>();
    for (int i = 0; i <= N - 1; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int d = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      birds[i] = new Bird(a, d, b);
      birdCount[a]++;
      colorCountSet.add(a);
    }
    br.close();
    Arrays.sort(birds);
    int birdIndex = 0;
    for (int i = 1; i <= M; i++) {
      while(birdIndex <= N - 1 && birds[birdIndex].getD() == i) {
        int a = birds[birdIndex].getA();
        int b = birds[birdIndex].getB();
        if (birdCount[a] == 1) {
          colorCountSet.remove(a);
        }
        birdCount[a]--;
        birdCount[b]++;
        colorCountSet.add(b);
        birdIndex++;
      }
      System.out.println(colorCountSet.size());
    }

  }
}