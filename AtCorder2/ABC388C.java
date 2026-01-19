import java.util.*;
import java.util.stream.*;
import java.io.*;

// ABC388C
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String firstLine = br.readLine();
    int n = Integer.parseInt(firstLine.trim());
    int[] aArray = new int[n + 1];
    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 1; i <= n; i++) {
      aArray[i] = Integer.parseInt(st.nextToken());
    }
    br.close();
    long answer = 0;
    int index = 0;
    if (aArray[1] <= aArray[2] / 2) {
      index = 1;
    }
    answer += index;
    for (int i = 3; i <= n; i++) {
      int a = aArray[i];
      int halfA = a / 2;
      while (index + 1 <= n && aArray[index + 1] <= halfA) {
        index++;
      }
      answer += index;
    }
    System.out.println(answer);
  }
}


// // ABC388C
// public class Main {
//   public static void main(String[] args) throws IOException {
//     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//     String firstLine = br.readLine();
//     int n = Integer.parseInt(firstLine.trim());
//     int[] aArray = new int[n + 1];
//     StringTokenizer st = new StringTokenizer(br.readLine());
//     for (int i = 1; i <= n; i++) {
//       aArray[i] = Integer.parseInt(st.nextToken());
//     }
//     br.close();
//     long answer = 0;
//     for (int i = 2; i <= n; i++) {
//       int a = aArray[i];
//       int halfA = a / 2;
//       int leftIndex = 1;
//       int rightIndex = i;
//       int middleIndex = (leftIndex + rightIndex) / 2;
//       while (leftIndex <= rightIndex) {
//         middleIndex = (leftIndex + rightIndex) / 2;
//         if (aArray[middleIndex] > halfA) {
//           rightIndex = middleIndex - 1;
//         } else if (aArray[middleIndex] < halfA) {
//           leftIndex = middleIndex + 1;
//         } else {
//           while (middleIndex + 1 <= n && aArray[middleIndex + 1] == halfA) {
//             middleIndex++;
//           }
//           break;
//         }
//       }
//       answer += middleIndex;
//     }
//     System.out.println(answer);
//   }
// }

// // ABC388C
// public class Main {
//   public static void main(String[] args) throws IOException {
//     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//     String firstLine = br.readLine();
//     int n = Integer.parseInt(firstLine.trim());

//     Map<Integer, Integer> mochiMap = new HashMap<>();
//     StringTokenizer st = new StringTokenizer(br.readLine());
//     for (int i = 0; i < n; i++) {
//       int a = Integer.parseInt(st.nextToken());
//       mochiMap.put(a, mochiMap.getOrDefault(a, 0) + 1);
//     }
//     br.close();

//     int[] mochiArray = mochiMap.keySet().stream().sorted().mapToInt(Integer::intValue).toArray();
//     int arraySize = mochiArray.length;
//     long answer = 0;
//     for (int i = 0; i < arraySize - 1; i++) {
//       for (int j = i + 1; j < arraySize; j++) {
//         if (mochiArray[i] <= mochiArray[j] / 2.0) {
//           answer += mochiMap.get(mochiArray[i]) * mochiMap.get(mochiArray[j]);
//         }
//       }
//     }
//     System.out.println(answer);
//   }
// }