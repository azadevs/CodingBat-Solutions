package string_1;

import java.util.Scanner;

public class MiddleTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(middleTwo(str));
    }

    public static String middleTwo(String str) {
        int len = str.length();
        return len >= 4 ? str.substring(len / 2 - 1, len / 2 + 1) : str;
    }
}
