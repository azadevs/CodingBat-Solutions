package string_1;

import java.util.Scanner;

public class NonStart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(nonStart(a, b));
    }

    public static String nonStart(String a, String b) {
        String finalA = a.substring(1);
        String finalB = b.substring(1);
        return finalA + finalB;
    }
}
