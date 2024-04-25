package string_1;

import java.util.Scanner;

public class WithoutEnd2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(withoutEnd2(str));
    }

    public static String withoutEnd2(String str) {
        int len = str.length();
        return len >= 2 ? str.substring(1, len - 1) : "";
    }
}
