
import java.util.*;
import java.util.stream.*;

//ABC409A
//public class ABC   {
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char[] tArray = scanner.next().toCharArray();
        char[] aArray = scanner.next().toCharArray();

        scanner.close();

        for (int i = 0; i < n; i++) {
            if (tArray[i] == 'o' && aArray[i] == 'o') {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
