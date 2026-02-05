import java.util.*;
import java.util.stream.*;

//ABC379A
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] nArray = scanner.next().split("");
    scanner.close();

    String bca = nArray[1] + nArray[2] + nArray[0];
    String cab = nArray[2] + nArray[0] + nArray[1];
    System.out.println(bca + " " + cab);
  }
}
