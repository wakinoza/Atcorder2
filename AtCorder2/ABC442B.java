import java.util.*;
import java.util.stream.*;

//ABC442B
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int q = scanner.nextInt();
    int volume = 0;
    boolean isPlaying = false;
    for (int i = 0; i < q; i++) {
      int a = scanner.nextInt();
      if (a == 1) {
        volume++;
      } else if (a == 2) {
        volume--;
        if (volume < 0) {
          volume = 0;
        }
      } else {
        isPlaying = (isPlaying)? false :true;
      }
      
      if (volume >= 3 && isPlaying) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
    scanner.close();
  }
}
