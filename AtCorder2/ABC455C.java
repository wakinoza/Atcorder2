
import java.util.*;
import java.util.stream.*;
import java.io.*;

// ABC455C

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer firstLine = new StringTokenizer(br.readLine());
    final int N = Integer.parseInt(firstLine.nextToken());
    final int K = Integer.parseInt(firstLine.nextToken());
    Map<Long, Long> aCountHash = new HashMap<>();
    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      Long a = Long.parseLong(st.nextToken());
      aCountHash.put(a, aCountHash.getOrDefault(a, 0L) + 1);
    }
    br.close();

    int aCountHashSize = aCountHash.size();
    if (aCountHashSize <= K) {
      System.out.println(0);
      return;
    }
    Long[] aSumArray = new Long[aCountHashSize];
    int index = 0;
    for(Map.Entry<Long, Long> entry : aCountHash.entrySet()) {
      aSumArray[index] = entry.getKey() * entry.getValue();
      index++;
		}
    Arrays.sort(aSumArray, Collections.reverseOrder());
    long answer = 0L;
    for (int i = K; i < aCountHashSize; i++) {
      answer += aSumArray[i];
    }
    System.out.println(answer);
  }
}