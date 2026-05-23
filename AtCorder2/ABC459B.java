
import java.util.*;
import java.util.stream.*;
import java.io.*;

// ABC459B
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    final int N = Integer.parseInt(br.readLine().trim());
    char[] initialS = new char[N];
    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      char[] s = st.nextToken().toCharArray();
      initialS[i] = s[0];
    }
    br.close();
    StringBuilder answer = new StringBuilder();
    for (char c : initialS) {
      int asciiValue = (int)c;
      if (asciiValue >= 97 && asciiValue <= 99) {
        answer.append("2");
      } else if (asciiValue >= 100 && asciiValue <= 102) {
        answer.append("3");
      } else if (asciiValue >= 103 && asciiValue <= 105) {
        answer.append("4");
      } else if (asciiValue >= 106 && asciiValue <= 108) {
        answer.append("5");
      } else if (asciiValue >= 109 && asciiValue <= 111) {
        answer.append("6");
      } else if (asciiValue >= 112 && asciiValue <= 115) {
        answer.append("7");
      } else if (asciiValue >= 116 && asciiValue <= 118) {
        answer.append("8");
      } else if (asciiValue >= 119 && asciiValue <= 122) {
        answer.append("9");
      }
    }
    System.out.println(answer.toString());
  }
}
