package string_1;

import java.util.Scanner;

public class WithoutEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(withoutEnd(str));
    }

    public static String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }
}
