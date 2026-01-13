
import java.util.*;
import java.util.stream.*;
import java.io.*;

// ABC392C
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String firstLine = br.readLine();
    int n = Integer.parseInt(firstLine.trim());

    StringTokenizer stP = new StringTokenizer(br.readLine());
    Map<Integer, Integer> indexAndLookForMap = new HashMap<>();
    for (int i = 1; i <= n; i++) {
      indexAndLookForMap.put(i, Integer.parseInt(stP.nextToken()));
    }
    StringTokenizer stQ = new StringTokenizer(br.readLine());
    Map<Integer, Integer> indexAndBibMap = new HashMap<>();
    Map<Integer, Integer> BibAndIndexMap = new HashMap<>();
    for (int i = 1; i <= n; i++) {
      int token = Integer.parseInt(stQ.nextToken());
      indexAndBibMap.put(i, token);
      BibAndIndexMap.put(token, i);
    }
    br.close();
    StringBuilder answer = new StringBuilder();
    for (int i = 1; i <= n; i++) {
      if (i > 1) {
        answer.append(" ");
      }
      answer.append(indexAndBibMap.get(indexAndLookForMap.get(BibAndIndexMap.get(i))));
    }
    System.out.println(answer.toString());
  }
}
