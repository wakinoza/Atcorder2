
import java.util.*;
import java.util.stream.*;
import java.io.*;

// ABC458B
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer firstLine = new StringTokenizer(br.readLine());
    final int H = Integer.parseInt(firstLine.nextToken());
    final int W = Integer.parseInt(firstLine.nextToken());
    br.close();
    
    if (H == 1 && W == 1) {
      System.out.println(0);
      return;
    } else if (H == 1) {
      StringBuilder answer = new StringBuilder();
      for (int i = 0; i < W; i++) {
        if (i >= 1) {
          answer.append(" ");
        }
        if (i == 0 || i == W - 1) {
          answer.append(1);
        } else {
          answer.append(2);
        }
      }
      System.out.println(answer.toString());
      return;
    } else if (W == 1) {
      for (int i = 0; i < H; i++) {
        if (i == 0 || i == H - 1) {
          System.out.println(1);
        } else {
          System.out.println(2);
        }
      }
      return;
    } else {
        for(int i = 0;i<H;i++) {
          StringBuilder answer = new StringBuilder();
          if (i == 0 || i == H - 1) {
            for (int j = 0; j < W; j++) {
              if (j >= 1) {
                answer.append(" ");
              }
              if (j == 0 || j == W - 1) {
                answer.append("2");
              } else {
                answer.append("3");
              }
            }
          } else {
            for (int j = 0; j < W; j++) {
              if (j >= 1) {
                answer.append(" ");
              }
              if (j == 0 || j == W - 1) {
                answer.append("3");
              } else {
                answer.append("4");
              }
            }
          }
        System.out.println(answer.toString());
      }
    }
  }
}


