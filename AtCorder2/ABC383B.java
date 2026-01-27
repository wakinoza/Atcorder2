import java.util.*;
import java.util.stream.*;

//ABC383B

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int h = scanner.nextInt();
    int w = scanner.nextInt();
    int d = scanner.nextInt();
    boolean[][] isFloor = new boolean[h][w];
    int[] floorIndexX = new int[h * w];
    int[] floorIndexY = new int[h * w];
    int floorIndex = 0;
    for (int i = 0; i < h; i++) {
      char[] sLine = scanner.next().toCharArray();
      for (int j = 0; j < w; j++) {
        char current = sLine[j];
        if (current == '.') {
          isFloor[i][j] = true;
          floorIndexX[floorIndex] = i;
          floorIndexY[floorIndex] = j;
          floorIndex++;
        } else {
          isFloor[i][j] = false;
        }
      }
    }
    scanner.close();
    int maxHumidTotal = 0;
    for (int i = 0; i < floorIndex - 1; i++) {
      int x1 = floorIndexX[i];
      int y1 = floorIndexY[i];
      for (int j = i + 1; j < floorIndex; j++) {
        int currentHumidTotal = 0;
        int x2 = floorIndexX[j];
        int y2 = floorIndexY[j];

        int firstIndexX = Math.max(0, x1 - d);
        int lastIndexX = Math.min(h - 1, x2 + d);
        int firstIndexY = Math.max(0, Math.min(y1, y2) - d);
        int lastIndexY = Math.min(w - 1, Math.max(y1, y2) + d);
        for (int k = firstIndexX; k <= lastIndexX; k++) {
          for (int l = firstIndexY; l <= lastIndexY; l++) {
            if (isFloor[k][l]) {
              boolean isHumid1 = (Math.abs(k - x1) + Math.abs(l - y1) <= d);
              boolean isHumid2 = (Math.abs(k - x2) + Math.abs(l - y2) <= d);
              if (isHumid1 || isHumid2) {
                currentHumidTotal++;
              }
            }
          }
        }
        if (maxHumidTotal < currentHumidTotal) {
          maxHumidTotal = currentHumidTotal;
        }
      }
    }
    System.out.println(maxHumidTotal);
  }
}
