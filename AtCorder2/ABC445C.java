
import java.util.*;
import java.util.stream.*;
import java.io.*;

// ABC445C
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String firstLine = br.readLine();
    int n = Integer.parseInt(firstLine.trim());
    Map<Integer, List<Integer>> prevIndexes = new HashMap<>();
    int[] nextIndexes = new int[n + 1];
    List<Integer> loopIndexes = new ArrayList<>();
    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 1; i <= n; i++) {
      int a = Integer.parseInt(st.nextToken());
      if (i == a) {
        loopIndexes.add(i);
      } else {
        nextIndexes[i] = a;
        if (prevIndexes.containsKey(a)) {
          prevIndexes.get(a).add(i);
        } else {
          prevIndexes.put(a, new ArrayList<>());
          prevIndexes.get(a).add(i);
        }
      }
    }
    br.close();
    if (loopIndexes.size() != 0) {
      int[] finalAnswers = new int[n + 1];
      Arrays.fill(finalAnswers, -1);

      Deque<Integer> stackIndex = new ArrayDeque<>();
      for (Integer loopIndex : loopIndexes) {
        stackIndex.add(loopIndex);
        while(!stackIndex.isEmpty()) {
          int currentIndex = stackIndex.poll();
          finalAnswers[currentIndex] = loopIndex;
          if (prevIndexes.containsKey(currentIndex)) {
            for (Integer prevIndex : prevIndexes.get(currentIndex)) {
              stackIndex.add(prevIndex);
            }
          }
        }
      }
      StringBuilder answer= new StringBuilder();
      for (int i = 1; i <= n; i++) {
        if (finalAnswers[i] != -1) {
          if (!answer.isEmpty()) {
            answer.append(" ");
          }
          answer.append(finalAnswers[i]);
        } else {
          int currentIndex = i;
          for (int j = 1; j <= 1000; j++) {
            currentIndex = nextIndexes[currentIndex];
            if (finalAnswers[currentIndex] != -1) {
              if (!answer.isEmpty()) {
                answer.append(" ");
              }
              answer.append(finalAnswers[currentIndex]);
              continue;
            }
          }
          if (!answer.isEmpty()) {
            answer.append(" ");
          }
          answer.append(currentIndex);
        }
      }
      System.out.println(answer.toString());
    }
  }
}