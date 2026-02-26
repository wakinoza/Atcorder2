import java.util.*;
import java.util.stream.*;

//ABC
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    String s = scanner.next();
    char[] sArray = scanner.next().toCharArray();
    scanner.close();
    System.out.println();
  }
}


import java.util.*;
import java.util.stream.*;
import java.io.*;

// ABC
public class Main {
  public static void main(String[] args) throws IOException {
    // 1. 入力準備（標準入力をバッファリングして読み込む）
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    //1行に数値が一つの時
    int n = Integer.parseInt(br.readLine().trim());

    // 数値列（A1 A2 ... AN）の読み込み
    // StringTokenizerは、読み込んだ1行の文字列を「空白」などで切り分ける役割
    StringTokenizer st = new StringTokenizer(br.readLine());

    for (int i = 0; i < n; i++) {
        // st.nextToken() は、内部のポインタを次の空白まで進めて文字列を返す
        int a = Integer.parseInt(st.nextToken());
    }

    // 1行に文字列が一つの時
    String s = br.readLine().trim();

    // 文字列の列（A1 A2 ... AN）の読み込み
    // StringTokenizerは、読み込んだ1行の文字列を「空白」などで切り分ける役割
    StringTokenizer st = new StringTokenizer(br.readLine());

    for (int i = 0; i < n; i++) {
      String s = st.nextToken();
    }
    br.close();
    System.out.println();
  }
}