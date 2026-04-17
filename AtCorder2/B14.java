
import java.util.*;
import java.util.stream.*;
import java.io.*;

// B014
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer firstLine = new StringTokenizer(br.readLine());
    final int N = Integer.parseInt(firstLine.nextToken());
    final int K = Integer.parseInt(firstLine.nextToken());
    int[] aArray = new int[N];
    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      aArray[i] = Integer.parseInt(st.nextToken());
    }
    br.close();
    Arrays.sort(aArray);
    Set<Integer> firstHalfSums = new HashSet<>();
    int index = 0;
    firstHalfSums.add(0);
    while(index <= N / 2) {
      int currentA = aArray[index];
      Set<Integer> temps = new HashSet<>();
      for (Integer sum : firstHalfSums) {
        temps.add(sum +  currentA);
      }
      firstHalfSums = Stream.concat(
          firstHalfSums.stream(),
          temps.stream())
          .collect(Collectors.toSet());
      index++;
    }
    Set<Integer> secondHalfSums = new HashSet<>();
    secondHalfSums.add(0);
    while(index < N) {
      int currentA = aArray[index];
      Set<Integer> temps = new HashSet<>();
      for (Integer sum : secondHalfSums) {
        temps.add(sum + currentA);
      }
      secondHalfSums = Stream.concat(
          secondHalfSums.stream(),
          temps.stream())
          .collect(Collectors.toSet());
      index++;
    }
    String answer = "No";
    for (Integer sum : firstHalfSums) {
      int diff = K - sum;
      if (secondHalfSums.contains(diff)) {
        answer = "Yes";
        break;
      }
    }
    System.out.println(answer);
  }
}
