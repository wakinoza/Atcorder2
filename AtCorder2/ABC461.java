
import java.util.*;
import java.util.stream.*;
import java.io.*;

// ABC461C
class Gem implements Comparable<Gem>{
  private int color;
  private int value;

  public Gem (int color, int value) {
    this.color = color;
    this.value = value;
  }

  public int getColor() {
    return this.color;
  }
  
  public int getValue() {
    return this.value;
  }

  public int compareTo(Gem gem) {
    if (this.value > gem.value) {
      return -1;
    } else if (this.value < gem.value) {
      return 1;
    } else {
      return 0;
    }
  }
}

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer firstLine = new StringTokenizer(br.readLine());
    final int N = Integer.parseInt(firstLine.nextToken());
    final int K = Integer.parseInt(firstLine.nextToken());
    final int M = Integer.parseInt(firstLine.nextToken());
    Gem[] gems = new Gem[N];
    for (int i = 0; i < N; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int c = Integer.parseInt(st.nextToken());
      int v = Integer.parseInt(st.nextToken());
      gems[i] = new Gem(c, v);
    }
    br.close();

    Arrays.sort(gems);
    long answer = 0L;
    boolean[] selected = new boolean[N];
    Set<Integer> selectedColor = new HashSet<>();
    int count = 0;
    for (int i = 0; i < N; i++) {
      Gem currentGem = gems[i];
      if (!selectedColor.contains(currentGem.getColor())) {
        answer += currentGem.getValue();
        selectedColor.add(currentGem.getColor());
        selected[i] = true;
        count++;
      }
      if (count == M) {
        break;
      }
    }
    for (int i = 0 ; i < N; i++) {
      if (!selected[i]) {
        answer += gems[i].getValue();
        count++;
      }
      if (count == K) {
        break;
      }
    }
    System.out.println(answer);
  }
}