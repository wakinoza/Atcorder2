import java.util.*;
import java.util.stream.*;
import java.io.*;

// ABC385C
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String firstLine = br.readLine();
    int n = Integer.parseInt(firstLine.trim());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] buildings =  new int[n];
    for (int i = 0; i < n; i++) {
      buildings[i]  = Integer.parseInt(st.nextToken());
    }
    br.close();

    int answer = 1;
    for (int d = 1; d < n; d++) {
      for (int s = 0; s < d; s++) {
        int currentCount = 0;
        int lastHeight = -1;
        for (int i = s; i < n; i += d) {
          if (buildings[i] == lastHeight) {
            currentCount++;
          } else {
            lastHeight = buildings[i];
            currentCount = 1;
          }
          answer = Math.max(answer, currentCount);
        }
      }
    }
    System.out.println(answer);
  }
}


// // ABC385C
// public class Main {
//   public static void main(String[] args) throws IOException {
//     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//     String firstLine = br.readLine();
//     int n = Integer.parseInt(firstLine.trim());
//     StringTokenizer st = new StringTokenizer(br.readLine());
//     Map<Integer, Set<Integer>> numberAndIndexes = new HashMap<>();
//     for (int i = 1; i <= n; i++) {
//       int h = Integer.parseInt(st.nextToken());
//       if (numberAndIndexes.get(h) == null) {
//         numberAndIndexes.put(h, new HashSet<Integer>());
//         numberAndIndexes.get(h).add(i);
//       } else {
//         numberAndIndexes.get(h).add(i);
//       }
//     }
//     br.close();

//     if (numberAndIndexes.size() == n) {
//       System.out.println(1);
//       return;
//     }
//     int answer = 0;
//     for (Set<Integer> indexSet : numberAndIndexes.values()) {
//       int indexSize = indexSet.size();
//       if (indexSize <= 2) {
//         if (answer < indexSize) {
//           answer = indexSize;
//         }
//         continue;
//       }
//       int[] indexArray = indexSet.stream().sorted().mapToInt(Integer::intValue).toArray();
//       for (int i = 0; i < indexSize - 1; i++) {
//         for (int j = i + 1; j < indexSize; j++) {
//           int buildingTotal = 2;
//           int diff = indexArray[j] - indexArray[i];
//           int currentIndex = indexArray[j] + diff;
//           while (currentIndex < n && indexSet.contains(currentIndex)) {
//             buildingTotal++;
//             currentIndex += diff;
//           }
//           if (answer < buildingTotal) {
//             answer = buildingTotal;
//           }
//         }
//       }
//     }
//     System.out.println(answer);
//   }
// }
