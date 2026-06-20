
import java.util.*;
import java.util.stream.*;
import java.io.*;

// ABC
class Person implements Comparable<Person>{
  private int h;
  private int l;

  public Person(int h , int l) {
    this.h = h;
    this.l = l;
  }

  public int getH() {
    return this.h;
  }
  
  public int getL() {
    return this.l;
  }

  public void setH(int h) {
    this.h = h;
  }

  public void setL(int l) {
    this.l = l;
  }

  public int compareTo(Person p) {
    if (this.l < p.l) {
      return -1;
    } else if (this.l > p.l) {
      return 1;
    } else {
      if (this.h < p.h) {
        return -1;
      } else if (this.h > p.h){
        return 1;
      } else {
        return 0;
      }
    }
  }

}
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final int N = Integer.parseInt(br.readLine().trim());
    Person[] persons = new Person[N];
    for (int i = 0; i < N; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int h = Integer.parseInt(st.nextToken());
      int l = Integer.parseInt(st.nextToken()) - 1;
      persons[i] = new Person(h, l);
    }
    Arrays.sort(persons);
    int maxH = persons[N - 1].getH();
    for (int i = N - 2; i >= 0; i--) {
      int currentH = persons[i].getH();
      if (maxH >= currentH) {
        persons[i].setH(maxH);
      } else {
        maxH = currentH;
      }
    }

    final int Q = Integer.parseInt(br.readLine().trim());
    StringTokenizer tLine = new StringTokenizer(br.readLine());
    for (int i = 0; i < Q; i++) {
      int t = Integer.parseInt(tLine.nextToken());
      int left = 0;
      int right = N - 1;
      int answer = 0;
      while(left <= right) {
        int mid = left + (right - left) / 2;
        int midL = persons[mid].getL();
        if (midL == t) {
          answer = mid;
          break;
        } else if (midL < t){
          left = mid + 1;

        } else {
          answer = mid;
          right = mid - 1;
        }
      }
      System.out.println(persons[answer].getH());
    }
    br.close();
    
  }
}
