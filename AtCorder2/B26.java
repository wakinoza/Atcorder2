
import java.util.*;
import java.util.stream.*;
import java.io.*;

// B26
public class Main {
  static boolean isPrime(int number) {
    if (number == 2) {
      return true;
    }
    if (number < 2 || number % 2 == 0) {
      return false;
    }
    int limit = (int) Math.sqrt(number);
    for (int counter = 3; counter <= limit; counter += 2) {
      if (number % counter == 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final int N = Integer.parseInt(br.readLine().trim());
    br.close();
    for (int i = 2; i <= N; i++) {
      if (isPrime(i)) {
        System.out.println(i);
      }
    }
  }
}
