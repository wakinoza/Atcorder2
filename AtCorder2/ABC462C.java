
import java.util.*;
import java.util.stream.*;
import java.io.*;

// ABC462C
class Point implements Comparable<Point> {
  private int x;
  private int y;

  public Point(int x ,int y){
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return this.x;
  }

  public int getY() {
    return this.y;
  }
  
  public int compareTo(Point p){
    if (this.x < p.x){
      return -1;
    } else if (this.x > p.x){
      return 1;
    }else {
      return 0;
    }
  }
}


public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine().trim());
    Point[] points = new Point[n];
    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int x = Integer.parseInt(st.nextToken());
      int y = Integer.parseInt(st.nextToken());
      points[i] = new Point(x, y);
    }
    br.close();
    
    Arrays.sort(points);
    int answer = 1;
    int minY = points[0].getY();
    for (int i = 1; i <= n - 1; i++) {
      int currentY = points[i].getY();
      if (currentY < minY) {
        answer++;
        minY = currentY;
      } 
    }
    System.out.println(answer);
  }
}