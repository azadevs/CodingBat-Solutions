package string_1;

import java.util.Scanner;

public class MakeAbba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(makeAbba(a, b));
    }

    public static String makeAbba(String a, String b) {
        return a + b + b + a;
    }
}
