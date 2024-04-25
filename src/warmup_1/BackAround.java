package warmup_1;

import java.util.Scanner;

public class BackAround {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(backAround(str));
    }

    public static String backAround(String str) {
        int len = str.length();
        char lastChar = str.charAt(len - 1);
        return lastChar + str + lastChar;
    }
}
