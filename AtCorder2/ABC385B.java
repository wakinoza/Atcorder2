import java.util.*;
import java.util.stream.*;

//ABC385B
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int h = scanner.nextInt();
    int w = scanner.nextInt();
    int x = scanner.nextInt();
    int y = scanner.nextInt();
    boolean[][] canWalks = new boolean[h][w];
    boolean[][] isHouse = new boolean[h][w];
    for (int i = 0; i < h; i++) {
      char[] sLine = scanner.next().toCharArray();
      for (int j = 0; j < w; j++) {
        char current = sLine[j];
        if (current == '#') {
          canWalks[i][j] = false;
          isHouse[i][j] = false;
        } else if (current == '.') {
          canWalks[i][j] = true;
          isHouse[i][j] = false;
        } else {
          canWalks[i][j] = true;
          isHouse[i][j] = true;
        }
      }
    }
    char[] tArray = scanner.next().toCharArray();
    scanner.close();
    int currentX = x - 1;
    int currentY = y - 1;
    int houseCount = 0;
    for (char direction : tArray) {
      if (direction == 'U' && currentX - 1 >= 0 && canWalks[currentX - 1][currentY]) {
        currentX--;
        if (isHouse[currentX][currentY]) {
          houseCount++;
          isHouse[currentX][currentY] = false;
        }
      } else if (direction == 'D' && currentX + 1 < h && canWalks[currentX + 1][currentY]) {
        currentX++;
        if (isHouse[currentX][currentY]) {
          houseCount++;
          isHouse[currentX][currentY] = false;
        }
      } else if (direction == 'L' && currentY - 1 >= 0 && canWalks[currentX][currentY - 1]) {
        currentY--;
        if (isHouse[currentX][currentY]) {
          houseCount++;
          isHouse[currentX][currentY] = false;
        }
      } else if (direction == 'R' && currentY + 1 < w && canWalks[currentX][currentY + 1]) {
        currentY++;
        if (isHouse[currentX][currentY]) {
          houseCount++;
          isHouse[currentX][currentY] = false;
        }
      }
    }
    System.out.println((currentX + 1) + " " + (currentY + 1) + " " + houseCount );
  }
}
