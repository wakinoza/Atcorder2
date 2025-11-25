import java.util.*;
import java.util.stream.*;

//ABC408B
//public class ABC 409B  {
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    Set <Integer> inputs = new TreeSet<>();
    for (int i = 0; i < n; i++) {
      inputs.add(scanner.nextInt());
    }
    scanner.close();
    System.out.println(inputs.size());
    String result = inputs.stream()
        .map(String::valueOf) //
        .collect(Collectors.joining(" "));
    System.out.println(result);
  }
}
