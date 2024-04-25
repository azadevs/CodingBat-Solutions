package string_1;

import java.util.Scanner;

public class FirstTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(firstTwo(str));
    }

    public static String firstTwo(String str) {
        int len = str.length();
        return len <= 2 ? str : str.substring(0, 2);
    }
}
