
import java.util.*;
import java.util.stream.*;
import java.io.*;

// ABC451C
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int Q = Integer.parseInt(br.readLine().trim());
    Map<Integer, Integer> hCount = new TreeMap<>();
    int answer = 0;
    for (int i = 0; i < Q; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int query = Integer.parseInt(st.nextToken());
      int h = Integer.parseInt(st.nextToken());
      if (query == 1) {
        hCount.put(h, hCount.getOrDefault(h,0) + 1);
        answer++;
        System.out.println(answer);

      } else {
        List<Integer> removeList = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : hCount.entrySet()){
          if (entry.getKey() > h) {
            break;
          } else {
            answer -= entry.getValue();
            removeList.add(entry.getKey());
          }
        }
        System.out.println(answer);
        for (Integer removeKey : removeList) {
          hCount.remove(removeKey);
        }
      }
    }
    br.close();
  }
}
