import java.util.*;
import java.util.stream.*;

//ABC390C
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int h = scanner.nextInt();
    int w = scanner.nextInt();
    char[][] gridColors = new char[h][w];
    int indexA = Integer.MAX_VALUE;
    int indexB = Integer.MIN_VALUE;
    int indexC = Integer.MAX_VALUE;
    int indexD = Integer.MIN_VALUE;
    for (int i = 0; i < h; i++) {
      char[] sLine = scanner.next().toCharArray();
      for (int j = 0; j < w; j++) {
        char current = sLine[j];
        gridColors[i][j] = current;
        if (current == '#') {
          if (indexA > i) {
            indexA = i;
          }
          if (indexB < i) {
            indexB = i;
          }
          if (indexC > j) {
            indexC = j;
          }
          if (indexD < j) {
            indexD = j;
          }
        }
      }
    }
    scanner.close();
    if (indexA == indexB && indexC == indexD) {
      System.out.println("Yes");
      return;
    }

    boolean canMakeRectangle = true;
    int blackCountInRectangle = 0;
    for (int i = indexA; i <= indexB; i++) {
      for (int j = indexC; j <= indexD; j++) {
        if (gridColors[i][j] == '.') {
          canMakeRectangle = false;
        }
      }
    }
    String answer = (canMakeRectangle)? "Yes": "No";
    System.out.println(answer);
  }
}