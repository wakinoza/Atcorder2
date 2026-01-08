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

// ABC
public class Main {
  public static void main(String[] args) throws IOException {
    // 1. 入力準備（標準入力をバッファリングして読み込む）
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 最初の1行（N）を読み込む
    String firstLine = br.readLine();
    int n = Integer.parseInt(firstLine.trim());

    // 2. 数値列（A1 A2 ... AN）の読み込み準備
    // StringTokenizerは、読み込んだ1行の文字列を「空白」などで切り分ける役割
    StringTokenizer st = new StringTokenizer(br.readLine());

    // 3. ループ内で1つずつトークン（単語）を取り出す
    for (int i = 0; i < n; i++) {
        // st.nextToken() は、内部のポインタを次の空白まで進めて文字列を返す
        int a = Integer.parseInt(st.nextToken());
    }
    scanner.close();
    System.out.println();
  }
}