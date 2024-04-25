package string_1;

import java.util.Scanner;

public class Left2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(left2(str));
    }

    public static String left2(String str) {
        int len = str.length();
        return len > 2 ? str.substring(2) + str.substring(0, 2) : str;
    }
}
