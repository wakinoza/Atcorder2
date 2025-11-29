import java.util.*;
import java.util.stream.*;

//ABC434B
class Bird {
  private int number;
  private int weightTotal = 0;
  private double count = 0.0;

  public Bird(int number) {
    this.number = number;
  }

  public int getNumber() {
    return this.number;
  }
  public double getCount() {
    return this.count;
  }
  public int getWeightTotal() {
    return this.weightTotal;
  }

  public void setCount() {
    this.count++;
  }
  public void setWeightTotal(int addWeight) {
    this.weightTotal += addWeight;
  }
}

public class ABC434B {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    Bird[] birds = new Bird[m + 1];
    for (int i = 1 ; i <= m; i++){
      birds[i] = new Bird(i);
    }
    for (int i = 0; i < n; i++) {
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      birds[a].setCount();
      birds[a].setWeightTotal(b);
    }
    scanner.close();
    for (int i = 1; i <= m; i++) {
      System.out.println(birds[i].getWeightTotal() / birds[i].getCount());
    }
  }
}
