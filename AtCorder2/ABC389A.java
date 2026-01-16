import java.util.*;
import java.util.stream.*;

//ABC389A
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] sArray = scanner.next().split("");
    scanner.close();
    int answer = Integer.parseInt(sArray[0]) * Integer.parseInt(sArray[2]);
    System.out.println(answer);
  }
}