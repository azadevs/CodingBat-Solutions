package string_1;

import java.util.Scanner;

public class Right2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(right2(str));
    }

    public static String right2(String str) {
        int len = str.length();
        return len > 2 ? str.substring(len - 2) + str.substring(0, len - 2) : str;
    }
}
