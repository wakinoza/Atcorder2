import java.util.*;
import java.util.stream.*;

//ABC379B
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int k = scanner.nextInt();
    boolean[] canEat = new boolean[n];
    char[] sArray = scanner.next().toCharArray();
    for (int i = 0; i < n; i++) {
      char current = sArray[i];
      if (current == 'O') {
        canEat[i] = true;
      } else {
        canEat[i] = false;
      }
    }
    scanner.close();
    int strawberryCount = 0;
    int strongTeethCount = 0;
    for (int i = 0; i < n; i++) {
      if (canEat[i]) {
        strongTeethCount++;
      } else {
        if (strongTeethCount >= k) {
          strawberryCount += (strongTeethCount / k);
        }
        strongTeethCount = 0;
      }
    }
    if (strongTeethCount >= k) {
      strawberryCount += (strongTeethCount / k);
    }
    System.out.println(strawberryCount);
  }
}
